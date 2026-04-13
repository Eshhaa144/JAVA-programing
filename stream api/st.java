import java.util.*;
public class st {
  public static void main(String[] args) {
    List<Integer> list=Arrays.asList(10,20,30,40,50,32,85,14);
    // jo no. 20 se jayada ho unhe double krna hai but we will not use loops we will use stream api
    list.stream().
    filter(n->n>20).
    map(n->n*2).
    forEach(System.out::println);
  }
}
