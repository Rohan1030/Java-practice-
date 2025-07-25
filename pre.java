import java.util.*;
public class pre {
  public static void main(String[] args)
  {
    int[] arr={1,2,3,4,5,6,7,8,34};
    int n= arr.length;


    int[] prefix = new  int[n];
    prefix[0]=arr[0];

    for(int i=1;i<n;i++)
    {
      prefix[i]=prefix[i-1] + arr[i];
    }

    int l=2;
    int r=4;
    int sum=0;
    if(l==0)
    {
      sum= prefix[r];
    } 
    else 
    {
      sum=prefix[r]-prefix[l-1];
    }
System.out.println(sum);
    



  }
  
}
