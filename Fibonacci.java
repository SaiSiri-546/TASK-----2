import java.util.*;
class Fibonacci {
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
          int sum = 0, n;
          int x = 0;
          int y = 1;
          System.out.println("Enter the nth no: ");
          n = sc.nextInt();
          System.out.println("Fibonacci series: ");
          while(sum<=n)
          {
              System.out.print(sum + " ");
              x=y;
              y=sum;
              sum=x+y;
          }
     }
}
