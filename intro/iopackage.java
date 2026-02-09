import java.io.*;
class iopackage
{
  public static void main(String [] arg) throws IOException
  {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
  
       System.out.println("enter your name");
       String name=br.readLine();
       System.out.println("my name is  "+name);
  }
}