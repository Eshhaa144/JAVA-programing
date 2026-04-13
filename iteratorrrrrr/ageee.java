import java.util.*;
public class ageee {
  public static void main(String[] args) {
    ArrayList<Integer> age = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    System.out.println("no. of students: ");
    int n = sc.nextInt();
    for(int i=0; i<n; i++) {
      System.out.println("age of student "+(i+1)+": ");
      int a = sc.nextInt();
      age.add(a);
    }
    // traversing the list through iterator
    Iterator<Integer> it = age.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }

  }
}
