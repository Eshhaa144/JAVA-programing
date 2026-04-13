import java.util.*;

public class Main {

  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    List<Integer> runs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("no. of player: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println("name of player " + (i + 1) + ": ");
      String a = sc.next();
      names.add(a);
    }  
      for (int j = 0; j < n; j++) {
        System.out.println("name of player " + (j + 1) + ": ");
        int r = sc.nextInt();
        runs.add(r);}
        for (String nam : names) {
          System.out.println(nam);
        }
        for (Integer run : runs) {
          System.out.println(run);
        }
    }
  }
