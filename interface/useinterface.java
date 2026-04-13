interface first
{
  void output();
}
class deri implements first
{
  public void output()
  {
     System.out.println("output meth of first interface");
  }
}

public class useinterface {
  public static void main(String[] args)
  {
    deri d=new deri();
    d.output();
  }
}
