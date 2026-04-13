import java.util.*;
public class pg {
  public static void main(String[] args) {
    List<Integer> list=Arrays.asList(10,22,31,40,59,32,85,14,17);
    list.stream().
    filter(n->n%2==0).sorted().
    forEach(System.out::println);
  }
}

