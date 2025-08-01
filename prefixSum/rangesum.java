// 1️⃣ Basic Range Sum — Brute Force
// Q: Given an array nums and indices i and j, write a function to return the sum of all elements from index i to j (inclusive).
// Goal: Get comfortable with loops, indexing, and ranges.
// 👉 Expected: O(n) for each query.

package prefixSum;
import java.util.*;


public class rangesum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // size of array
    System.out.println("Enter the size of array: ");
    int n = sc.nextInt();
    // array with size n
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }

    System.out.println("Enter start : ");
    int i = sc.nextInt();

    System.out.println("Enter end : ");
    int j = sc.nextInt();

    int sum =0;
    for(int k=i;k<=j;k++)
    {
     sum += arr[k];
    }
    System.out.println("Sum from index " + i + " to " + j + " is: " + sum);



    

  }

  
}
