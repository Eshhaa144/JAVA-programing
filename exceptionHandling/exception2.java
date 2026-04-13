public class exception2 {
  public static void main(String[] arg) {
    // String name = null;
    // try {
    //   System.out.println("length of string is" + name.length());
    // } catch (NullPointerException ex) {
    //   System.out.println("error is: " + ex.getMessage());
    // }
    // // System.out.println("length of string is" + name.length());
      try {
        String name = null;
        System.out.println("length of string is" + name.length());
      } catch (Exception ex) {
        System.out.println("error is: " + ex.getMessage());
      }
    System.out.println("end of program");
  }
}
