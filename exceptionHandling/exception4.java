public class exception4 {
  public static void main(String[] arg)
  {
    String str="abc";
    try{
    int num=Integer.parseInt(str);
    System.out.println("number is: "+num);
    }
    catch(NumberFormatException ex)
    {
      System.out.println("error is: "+ex.getMessage());
    }
    // int num=Integer.parseInt(str);
    // System.out.println("number is: "+num);
      System.out.println("end of program");
  }
}
