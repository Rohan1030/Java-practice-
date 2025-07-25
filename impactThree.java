import java.util.*;
public class impactThree {
  
    public static void main(String[] args)
    {
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter 4 digit no. :-");
      int n = sc.nextInt();
      int secondNo = n%10;
      int firstNo = n%1000;
    
      
      int sum = firstNo + secondNo;
      System.out.print(sum);


      

  
    }
    
  
  
}
