abstract class shape
{
  abstract void display();
}
class rectangle extends shape
{
  void display()
  {
    System.out.println("4 sidesss");
  }
}
class circle extends shape{
  void display()
  {
    System.out.println("rounddd");
  }
}
class triangle extends shape
{
  void display()
  {
    System.out.println("3 sidessss");
  }
}

public class use_abs
{
  public static void main(String[] arg)
  {
      shape obj=new circle();
      obj.display();
      shape obj1=new rectangle();
      obj1.display();
      shape obj2=new triangle();
      obj2.display();
  }
}