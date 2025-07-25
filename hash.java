import java.util.*;
public class hash {
  public static void main(String[] args) {
    int[] arr={2,3,4,5,3,6,7,6,1};
    int target=8;
    HashSet<Integer> seen = new HashSet<>();
    boolean found = false;
    for(int nums:arr)
    {   
      int compliment = target-nums;

      if(seen.contains(compliment))
      {
        found = true;
        System.out.println(nums+"+"+compliment+" = "+target);
        break;
      }
      else 
      {
        seen.add(nums);
      }
    }
  }
  
}
