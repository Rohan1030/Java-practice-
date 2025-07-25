import java.util.Scanner;
public class tofindsqaure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter a number : ");
        a =  sc.nextInt();
        int sum = a*a*a;
        System.out.println("Square of number  = " +sum);
    }
    
}
