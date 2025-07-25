
// 2️⃣ Prefix Sum Array Construction
// Q: Write a function that takes an array nums and returns its prefix sum array prefix.
// prefix[i] = sum of nums[0] to nums[i].
// 👉 Verify by printing both nums and prefix.
package prefixSum;
import java.util.*;

public class arrayConst {


public static int[] buildsum(int[] arr)
{
  int n = arr.length;
  int[] prefixsum = new int[n];
  prefixsum[0] = arr[0];
  
 for(int i=1;i<n;i++)
 {
  prefixsum[i] = prefixsum[i-1] + arr[i];
 }
 return prefixsum;

  
}



  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size : ");
    int n = sc.nextInt();
      int[] arr = new int[n];

      for(int i=0;i<n;i++)
      {
        arr[i] = sc.nextInt();
      }
    
      int[] prefixsum = buildsum(arr);
      for(int i=0;i<n;i++)
      {
        System.out.println(prefixsum[i]);

      }
      

    
  }
  
}
