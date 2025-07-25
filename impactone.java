import java.util.*;
class impactone
{

public static void main(String[] arga)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter row :- ");
  int row = sc.nextInt();

  System.out.println("Enter column :- ");
  int column = sc.nextInt();

  System.out.println("Enter seat no :- ");
  int seat  = sc.nextInt();

  if(seat <= column || seat%column==0 || seat%column==1)
  {
      System.out.println("Cse");
  }
  else
  {
    System.out.println("Ece");
  }


}


  
  }