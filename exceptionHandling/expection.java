
public class expection {
  public static void main(String[] arg) {
    int a = 10;
    int b = 0;
   try{
     int c = a / b;
     System.out.println("result=" + c);
   }
   catch(ArithmeticException ae)
   {
      System.out.println("error is: "+ae.getMessage());
   }
    System.out.println("end of program");
  }
}
