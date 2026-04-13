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
public class single_inherritance
{
  public static void main(String [] arg)
  {
    dog obj=new dog();
    obj.eat();
    obj.bark();
  }
}