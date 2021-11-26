import java.util.*;
class Reversestring
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    String n = s.nextLine();
    StringBuilder m = new StringBuilder(n);
    System.out.print(m.reverse());
  }
}
