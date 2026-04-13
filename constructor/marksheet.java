import java.util.*;
class marks
{
  int maths;
  int phy;
  int chem;
  int t;
  double p;
  marks(int maths,int phy,int chem)
  {
    this.maths=maths;
    this.phy=phy;
    this.chem=chem;
    t=maths+chem+phy;
    p=(t/300.0)*100;
    System.out.println("total is: "+t);
    System.out.println("percentage is : "+p);

  }
}
public class marksheet
{
  public static void main (String [] arg)
  {
      Scanner sc= new Scanner(System.in);
      System.out.println("maths: ");
      int maths =sc.nextInt();
      System.out.println("phy: ");
      int phy =sc.nextInt();
      System.out.println("chem: ");
      int chem =sc.nextInt();
      marks m1 = new marks(maths,phy,chem);
  }
}