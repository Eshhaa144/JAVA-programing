public class exception5 {
  public static void main(String[] arg) {
   int arr[] = { 10, 20, 30, 40, 50 };
    try {
      System.out.println("element is: " + arr[6]);
    } 
    catch(Exception ex)
   {
     System.out.println("error is: "+ex.getMessage());
    } 
  //   catch (ArrayIndexOutOfBoundsException ex) {
  //     System.out.println("error is: " + ex.getMessage());
  //   } 
  //   catch (NullPointerException ex) {
  //     System.out.println("error is: " + ex.getMessage());
  //  }
  //  catch(NumberFormatException ex)
  //  {
  //    System.out.println("error is: "+ex.getMessage());
  //  }
  //  catch(Exception ex)
  //  {
  //    System.out.println("error is: "+ex.getMessage());
  // } 
  System.out.println("end of program");  
  } 
}

//there is a compile time error because the catch block for the parent exception (Exception) is placed before the catch blocks for the child exceptions (ArrayIndexOutOfBoundsException, NullPointerException, NumberFormatException). In Java, catch blocks are evaluated in order, and once a catch block is matched, the subsequent catch blocks are not evaluated. Therefore, the catch block for the parent exception will catch all exceptions of that type and its subclasses, making the subsequent catch blocks unreachable. To fix this issue, you should place the catch block for the parent exception after all the catch blocks for the child exceptions.
