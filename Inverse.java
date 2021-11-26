import java.util.*;
class Inverse
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    boolean b = true;
    int[] a = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i] = sc.nextInt();
    }
    for(int j=0;j<n;j++)
    {
      if(a[a[j]]=j)
      {
        b = true;
        continue;
      }
      else
      {
        break;
        b = false;
      }
    }
    System.out.print(b);
  }
}
