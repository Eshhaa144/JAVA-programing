import java.io.*;
import java.util.*;

public class file3 {
  public static void main(String[] args) {
    try {
      File fo = new File("mainjava.txt");
      if (fo.createNewFile()) {
        System.out.println("file is create");
      } else {
        System.out.println("not created");
      }
      FileWriter fw = new FileWriter("mainjava.txt");
      File f1=new File ("filer.txt");
     
      
      Scanner sc=new Scanner(f1);
      while(sc.hasNextLine())
      {
        String data=sc.nextLine();
        fw.write(data);
        fw.write("\n");
      }
      sc.close();
       File f2=new File("filer2.txt");
      Scanner sc2=new Scanner(f2);
      while(sc2.hasNextLine())
      {
        String data=sc2.nextLine();
        fw.write(data);
        fw.write("\n");
      }
      sc2.close();
      fw.close();
     
    } 
    catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
    }
  }
}
