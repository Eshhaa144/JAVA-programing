import java.io.*;

public class filehand1 {
  public static void main(String[] args) {
    try {
      File fo = new File("firstjava.txt");
      if (fo.createNewFile()) {
        System.out.println("file is create");
      } else {
        System.out.println("not created");
      }
    } catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
    }
  }
}
