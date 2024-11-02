 import java.util.Scanner;
 
 public class first{
    public static  void main(String[] args) {
        int r ;
        double pi = 3.14 , area ;
        
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle =  ");
        r = sc.nextInt();
        area = pi*r*r;
        System.out.println("The Area of the circle : "+area);


    }
}