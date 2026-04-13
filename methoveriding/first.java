class vehicle
{
  void run()
  {
    System.out.println("running");
  }
}
class bike extends vehicle
{
  void run()
  {
     System.out.println("running bike");
  }
}
class bicycle extends vehicle
{
  void run()
  {
     System.out.println("running sloww bicycle");
  }
}
class car extends vehicle
{
  void run()
  {
     System.out.println("running fast...");
  }
}
public class first
{
  public static void main(String[] arg)
  {
      car c=new car();
      c.run();

      vehicle obj=new bicycle(); //refrence banayaa ....Yehi hai IS_A RELATIONSHIP
      obj.run();

      bike b=new bike();
      b.run();
  }
}