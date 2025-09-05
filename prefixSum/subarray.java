// 4️⃣ Check Subarray Sum Equals Target (Naive)
// Q: Given nums and target, check if any subarray sums to target. Do it with brute force first.
// 👉 Practice nested loops, sum every range

package prefixSum;
import java.util.*;

public class subarray {
  public static void main(String[] args) {
    
    int[] nums = {1,2,3,4,5,3,3};
    int target = 5;
    int n = nums.length;
    boolean result = false;

      for(int i=0;i<n;i++)
      {
        int sum =0;
        for(int j=i;j>=0;j--)
        {
          sum += nums[j];
          if(sum == target)
          {

            
          }
        }
      }


  }
  
}
