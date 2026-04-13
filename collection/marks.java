import java.util.*;

public class marks {
  public static void main(String[] args) {
    Collection<Integer> marks = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("print the marks 1: ");
    int m1 = sc.nextInt();
    marks.add(m1);
    System.out.println("print the marks 2: ");
    int m2 = sc.nextInt();
    marks.add(m2);
    System.out.println("print the marks 3: ");
    int m3 = sc.nextInt();
    marks.add(m3);
    System.out.println("print the marks 4: ");
    int m4 = sc.nextInt();
    marks.add(m4);
    System.out.println("print the marks 5: ");
    int m5 = sc.nextInt();
    marks.add(m5);
    System.out.println(marks);
  }
}
