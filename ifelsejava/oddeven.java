import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        if(n%2==0)
        {
            System.out.println("The number you entered is even");
            
        }
       else{
            System.out.println("THe number you entered is odd");

        }
        


        
    }

    
}
