class Base
{
  public void display()
  {
    System.out.println("display method");
  }
}
class Derived extends Base
{
  @Override
  public void display(int a) //error isliye kuki base class ka meth bina parameter ke hai so overrride possible nahi hai!!
  {
    System.out.println("display of derived classss");
  } 
}
public class overrideprog {
  public static void main(String[] args) {
    
  }
}
