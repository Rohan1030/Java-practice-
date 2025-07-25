import java.util.*;
public class hashm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();

    } 

    HashMap<Integer,Integer> freq = new HashMap<>();

    for(int num:arr)
    {
      freq.put(num,freq.getOrDefault(num,0)+1);
    }
    for(Map.Entry<Integer,Integer> entry : freq.entrySet() )
    {
      System.out.println(entry.getKey()+" "+entry.getValue());
    }













  }
  
}
