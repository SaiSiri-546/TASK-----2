import java.util.*;
class ArrayList
{
  public static void main(String args[])
  {
    Scanner c = new Scanner(System.in);
    System.out.print("Enter the number of elements:")
    int n = c.nextInt();
    List<Integer> lis = new ArrayList<>();
    for(int i=0;i<n;i++)
    {
      lis.add(c.nextInt())
    }
    System.out.print("Enter the element to be removed");
    int no = c.nextInt();
    boolean bo = lis.remove(no);
    System.out.print(bo);
  }
}
