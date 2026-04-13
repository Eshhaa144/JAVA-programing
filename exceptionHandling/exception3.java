public class exception3 {
  public static void main(String[] arg) {
   int arr[] = { 10, 20, 30, 40, 50 };
    try {
      System.out.println("element is: " + arr[6]);
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("error is: " + ex.getMessage());
    } 
    catch (NullPointerException ex) {
      System.out.println("error is: " + ex.getMessage());
   }
   catch(NumberFormatException ex)
   {
     System.out.println("error is: "+ex.getMessage());
   }
   catch(Exception ex)
   {
     System.out.println("error is: "+ex.getMessage());
  } 
  System.out.println("end of program");  
} 
}
