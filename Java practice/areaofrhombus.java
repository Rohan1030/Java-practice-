import java.util.Scanner;

public class areaofrhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diogonal D1 =  ");
        double D1  = sc.nextInt();
        System.out.print("Enter diogonal D2 =  ");
        double D2 = sc.nextInt();

        double A = (D1*D2/2);
        System.out.println("Aear of rhombus : "+A);

        
    }
    
}
