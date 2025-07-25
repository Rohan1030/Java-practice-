// 3️⃣ Use Prefix Sum for Range Sum Query
// Q: Now, given your prefix array, write a function to get the sum from index i to j in O(1).
// Formula: sum(i,j) = prefix[j] - prefix[i-1] (watch out for i == 0).

package prefixSum;
import java.util.*;

public class rangequery {
  // this function is used to find prefix sum 

public static int[] buildprefixsum(int[] nums)
{
  int n = nums.length;
  int[] prefixsum = new int[n];
  prefixsum[0] = nums[0];
   for(int i=1;i<n;i++)
   {
    prefixsum[i] = prefixsum[i-1] + nums[i];
   }
   return prefixsum;

}


// this function is used to find the index from where we need to find the index i and j 
public static int rangesum(int[] prefixsum,int i,int j)
{
  if(i==0)
  {
    return prefixsum[j];

  }else 
  {
    return prefixsum[j]-prefixsum[i-1];
  }


}


public static void main(String[] args)
{

  Scanner sc = new Scanner(System.in);
   System.out.println("Enter the array size : ");
   int n = sc.nextInt();


   int [] nums = new int[n];
   System.out.println("Enter the arrays : ");

   for(int i=0;i<n;i++)
   {
    nums[i] = sc.nextInt();
   }

   // build prefix sum 

   
   int[] prefixsum = buildprefixsum(nums);

System.out.println("Prefixsum array :" );

for(int i=0;i<n;i++)
{
  System.out.println(prefixsum[i]+" ");
}
System.out.println();


System.out.println("enter start index : ");
int i = sc.nextInt();

System.out.println("enter end index : ");
int j = sc.nextInt();

int sum = rangesum(prefixsum, i, j);

System.out.println(sum);








}
  
}
