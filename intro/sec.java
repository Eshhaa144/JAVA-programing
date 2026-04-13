import java.util.*;
class sec
{
  public static void main(String [] arg)
  {
    // int id=54;
    // String name="Esha";
    // Double height=5.8;
    // char gen='F';
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter ID:");
    int id=sc.nextInt();
    System.out.println("Enter name:");
    String name=sc.next();
    System.out.println("Enter gender:");
    char gen=sc.next().charAt(0);
    System.out.println("Enter height:");
    double height=sc.nextDouble();
    System.out.println("Enter address:");
    String add=sc.next();
    System.out.println("name is "+name);
     System.out.println("id is "+id);
      System.out.println("height is "+height);
       System.out.println("gender is "+gen);
       System.out.println("adress is "+add);
  }
}