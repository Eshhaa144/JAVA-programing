import java.util.*;

public class foreachmethod2 {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    List<String> emp = new ArrayList<>();

    System.out.print("Enter number of employees: ");
    int n = sc.nextInt();
    sc.nextLine();   ;;

    for(int i = 0; i < n; i++)
    {
      System.out.println("Enter employee name: ");
      String name = sc.nextLine();
      emp.add(name);
    }

    emp.forEach(e -> System.out.println(e));
  }
}