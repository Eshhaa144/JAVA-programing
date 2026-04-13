abstract class ABC
{
  abstract void print();
  void output()
  {
    System.out.println("abs class not meth so we can call this meth by extening abs class to main meth");
  }
}

public class abs extends ABC{
  @Override
    void print()
    {
      System.out.println("this is the abs meth of abs classss calling it by override");
    }
  public static void main(String[] arg)
  {
    ABC obj=new abs();
    obj.output();
    obj.print();
  
  }
}