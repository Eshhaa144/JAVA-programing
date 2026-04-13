class myAirth
{
  int addval(int a,int b)
  {
    return a+b;
  }
  int addval(int a,int b,int c)
  {
    return a+b+c;
  }
   double addval(double a,double b,double c)
  {
    return a+b+c;
  }
}

public class one{
  public static void main(String [] arg)
  {
      myAirth obj=new myAirth();
      System.out.println("RESULT : "+obj.addval(100,85));
      System.out.println("RESULT : "+obj.addval(5,8,7));
      System.out.println("RESULT : "+obj.addval(5.8,8.4,7.9));
  }
}