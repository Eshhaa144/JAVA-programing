public class exception1 {
  public static void main(String[] arg)
  // {
  // int a[]={10,20,30,40,50};
  // System.out.println("element is: "+a[6]);
  // System.out.println("end of program");
  {
    int a[] = { 10, 20, 30, 40, 50 };
    try {
      System.out.println("element is: " + a[6]);
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("error is: " + ex.getMessage());
    }
    System.out.println("end of program");
  }
  // }
}
