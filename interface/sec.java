interface first
{
  void output();
}
interface second {
  void next();
}
class deri implements first,second
{
  public void output()
  {
     System.out.println("output meth of first interface");
  }
  public void next()
  {
    System.out.println("next meth of second interface");
  }

}

public class sec {
  public static void main(String[] args)
  {
    deri d=new deri();
    d.output();
    d.next();
  }
}

