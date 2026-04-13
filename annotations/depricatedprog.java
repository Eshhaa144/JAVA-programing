class myclass
{
  @Deprecated
  public int addval(int a,int b)
  {
    return a+b;
  }
  public int addnumber(int a,int b)
  {
    return a+b;
  }
}
class location
{
  @Deprecated
  public void allahbad()
  {
    System.out.println("allahbadddddd");
  }
  public void prayagraj()
  {
    System.out.println("prayagrajjjj");
  }
}

public class depricatedprog {
  public static void main(String[] args) {
    myclass obj=new myclass();
    System.out.println("result is: "+obj.addnumber(23, 49));
    location obj2=new location();
    obj2.allahbad();//this show ki voh purana hogya hamne vaise bhi deprecated lagaya!!!
    obj2.prayagraj();
  }
}
