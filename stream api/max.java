import java.util.*;

public class max {
  public static void main(String[] args)
  {
    List<Integer>list=Arrays.asList(21,30,84,6,54,94);
    int max=list.stream().max(Integer::compare).get();
    System.out.println("Max element is: "+max);
  }
}
