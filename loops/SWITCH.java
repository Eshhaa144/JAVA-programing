import java.util.*;
class SWITCH
{
  public static void main(String [] arg)
  {
    Scanner sr=new Scanner(System.in);
    System.out.println("enter the day no. (1 to 7):");
    int n=sr.nextInt();
    switch(n)
    {
      case 1:
        System.out.println("SUNDAY");
        break;
      case 2:
        System.out.println("MONDAY");
        break;
      case 3:
        System.out.println("TUESDAY");
        break;
      case 4:
        System.out.println("WEDNESDAY");  
        break;
      case 5:
        System.out.println("THRUSDAY");
        break;
      case 6:
        System.out.println("FRIDAY");
        break;
      case 7:
        System.out.println("SATURDAY");
        break;
      default :
        System.out.println("invalid");       
        break;    
    }
  }
}