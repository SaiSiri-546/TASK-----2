import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        String a, b = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        a = sc.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("Given string is a palindrome.");
        }
        else
        {
            System.out.println("Given string is not a palindrome.");
        }
    }
}
