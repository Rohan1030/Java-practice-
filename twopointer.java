import java.util.*;
public class twopointer {
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8,9};
    int target =10;

    boolean  found = false;

    int left = 0;
    int right = arr.length-1;

    while(left<right)
    {
      int sum = arr[left] + arr[right];
      if(sum==target)
      {
        found = true;
         System.out.println(arr[left] + "+"+ arr[right]+"="+sum);
        break;
       
      } else if(sum<target)
      {   
        left++;
      }
      else 
      {
        right--;
      }


    }
  }
  
}
