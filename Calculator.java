import java.util.*;
class Calculator
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number:");
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.print("Enter the operator:");
      char c = sc.nextLine();
      switch(c)
      {
        case "+" : System.out.print(a+b); 
          break;
        case "-" : System.out.print(a-b); 
          break;
        case "*" : System.out.print(a*b); 
          break;
       case "/" : System.out.print(a/b); 
          break;
      default: System.out.print("Wrong input operator");
      }
  }
}
