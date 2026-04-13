<<<<<<< HEAD
import java.io.*;
class data
{
  public static void main(String [] arg) throws IOException
  {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
      System.out.println("enter your id");
       int id=Integer.parseInt(br.readLine());
       System.out.println("enter your name:");
       String name=br.readLine();
       System.out.println("add:");
       String add=br.readLine();
       System.out.println("enter your height");
       Double height=Double.parseDouble(br.readLine());
       System.out.println("my name is  "+name);
       System.out.println(id);
       System.out.println(add);
       System.out.println(height);
  
  }
=======
import java.io.*;
class data
{
  public static void main(String [] arg) throws IOException
  {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
      System.out.println("enter your id");
       int id=Integer.parseInt(br.readLine());
       System.out.println("enter your name:");
       String name=br.readLine();
       System.out.println("add:");
       String add=br.readLine();
       System.out.println("enter your height");
       Double height=Double.parseDouble(br.readLine());
       System.out.println("my name is  "+name);
       System.out.println(id);
       System.out.println(add);
       System.out.println(height);
  
  }
>>>>>>> 013b713d26bd13ce1e52991e1776001539eafad2
}