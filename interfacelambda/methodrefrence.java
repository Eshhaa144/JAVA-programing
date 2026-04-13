import java.util.*;

public class methodrefrence {
  public static void main(String[] args)
  {
    List<String> student=Arrays.asList("asdf","asdcv");
    student.forEach(System.out::println);
  }
}
