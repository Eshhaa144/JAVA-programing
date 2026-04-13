import java.io.*;
public class file2 {
  public static void main(String[] args) {
    try{
      FileWriter fo=new FileWriter("firstjava.txt");
      fo.write("hello worlddd");
      fo.close();
    }
    catch(Exception ex)
    {
      System.out.println("error : "+ex.getMessage());
    }
  }
}
