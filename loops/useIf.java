import java.util.*;
class useIf{
  public static void main(String [] arg)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the no: ");
    int n=sc.nextInt();
    if(n%2==0)
    {
      System.out.println("even");
    }
    else
    {
      System.out.println("odd");
    }
  }
}