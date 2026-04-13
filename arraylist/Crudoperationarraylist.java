import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Crudoperationarraylist {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> naam = new ArrayList<>();
    int ch;
    do {
      System.out.println("ARRAY LIST MENUUU");
      System.out.println("1.add");
      System.out.println("2.update");
      System.out.println("3.display");
      System.out.println("4.delete");
      System.out.println("5.search");
      System.out.println("6.exit");
      System.out.println("enter choice:");
      ch = sc.nextInt();
      switch (ch) {
        case 1:
          System.out.println("enter name to add: ");
          String name = sc.next();
          naam.add(name);
          break;
        case 2:
          System.out.println("enter the index for update:");
          int index = sc.nextInt();
          if (index >= 0 && index < naam.size()) {
            System.out.println("enter naam:");
            name = sc.next();
            naam.set(index, name);
            System.out.println("Updatedddd!!!!!!!!");
          }

          break;
        case 3:
          System.out.println("List of students: ");
          System.out.println("index\tname");
          index = 0;
          for (String stu : naam) {
            System.out.println(index + "\t" + stu);
            index++;
          }
          break;
        case 4:
          System.out.println("enter the name to delete: ");
          String deleteName = sc.next();
          boolean found = false;

          for (int i = 0; i < naam.size(); i++) {
            if (naam.get(i).equals(deleteName)) {
              naam.remove(i);
              System.out.println("Deleted successfully");
              found = true;
              break;
            }
          }
          if (!found) {
            System.out.println("Not found");
          }
          break;

        case 5:
          System.out.println("enter the name to search: ");
          String searchName = sc.next();
          found = false;

          for (int i = 0; i < naam.size(); i++) {
            if (naam.get(i).equals(searchName)) {
              System.out.println("Found at index: " + i);
              found = true;
              break;
            }
          }
          if (!found) {
            System.out.println("Not found");
          }
          break;

        case 6:
          System.out.println("exit the program.....");
          return;

      }
    } while (ch != 6);
  }
}
