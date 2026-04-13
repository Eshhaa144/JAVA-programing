import java.io.*;
public class usethrows {
  public static void main(String[] args) throws IOException
  {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    System.out.println("enter the string");
    String str=br.readLine();
    System.out.println("the string is: "+str);
  }
}
