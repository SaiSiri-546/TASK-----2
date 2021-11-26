import java.util.*;
class PandC
{
    static long factorial(int num)
    {
        int factorial = 1;
        for (int i = 1; i <= num; i++)
        {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = n.nextInt();
        System.out.print("Enter the value of r: ");
        int r = n.nextInt();
        int P = (int)(factorial(n) / factorial(n - r));
        int C = (int)(factorial(n) / (factorial(n - r) * factorial(r)));
        if( n < r)
        {
            System.out.println("Invalid number");
        }
        else
        {
            System.out.println("Permutation = " + P);
            System.out.println("Combination = " + C);
        }
    }
}
