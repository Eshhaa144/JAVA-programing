import java.util.*;
public class sq {
  public static void main(String[] args) {
    List<Integer> li=Arrays.asList(22,31,40,59,32,85);
    li.stream().
    map(n->n*n).sorted().
    forEach(System.out::println);
  }
}

