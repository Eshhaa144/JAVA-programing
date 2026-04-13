class Animal
{
  void eat()
  {
    System.out.println("eating.....");
  }
}
class dog extends Animal
{
  void bark()
  {
    System.out.println("barking.....");
  }
}
class dogbaby extends dog
{
  void numnum()
  {
    System.out.println("numnumDUMDUMNUMNUM....");
  }
}
public class multilevel_inherritance
{
  public static void main(String [] arg)
  {
    dogbaby obj=new dogbaby();
    obj.eat();
    obj.bark();
    obj.numnum();
  }
}