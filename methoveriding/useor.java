abstract class bank
{
  abstract double getInterest();  // yeh abstract se kia hai....koi farak nahi padega 
  // {
  //   return 0;
  // }
}
class SBI extends bank
{
  @Override
  double getInterest()
  {
    return 4.5;
  }
}
class PNB extends bank
{
  @Override
  double getInterest()
  {
    return 4.8;
  }
}
class HDFC extends bank
{
  @Override
  double getInterest()
  {
    return 10;
  }
}
public class useor
{
  public static void main(String[] arg)
  {
    bank obj=new SBI();
    System.out.println("SBIB interest is : "+obj.getInterest());
    bank obj1=new PNB();
    System.out.println("PNB interest is : "+obj1.getInterest());
    bank obj2=new HDFC();
    System.out.println("HDFC interest is : "+obj2.getInterest());
  }

}