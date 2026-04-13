import java.io.*;
import java.util.*;

public class file4 {
  public static void main(String[] args) {
    try {
      File f1=new File ("filer.txt");
      Scanner sc=new Scanner(f1);
      while(sc.hasNextLine())
      {
        String data=sc.nextLine();
        System.out.println(data);
      }
      sc.close();
       File f2=new File("filer2.txt");
      Scanner sc2=new Scanner(f2);
      while(sc2.hasNextLine())
      {
        String data=sc2.nextLine();
        System.out.println(data);
      }
      sc2.close();
       File fo = new File("mainjava.txt");
       Scanner sc3=new Scanner(fo);
      while(sc3.hasNextLine())
      {
        String data=sc3.nextLine();
        System.out.println(data);
      }
      sc3.close();
     
    } 
    catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
    }
  }
}
