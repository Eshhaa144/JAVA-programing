class employee
{
  void display()
  {
    System.out.println("display employee");
  }
  void output()
  {
    System.out.println("output of employee");
  }
}
class oops1
{
  public static void main(String [] arg)
  {
    employee eobj=new employee();
    eobj.display();
    eobj.output();
  }
}