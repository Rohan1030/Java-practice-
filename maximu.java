import java.util.*;
public class maximu {
  public static void main(String[] args)
  {
    int[] arr={1,2,3,4,56,4};
    int max=arr[0];

    for(int i=0;i<arr.length-1;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];

      }
    }
    System.out.println(max);
  }
  
}
