import java.util.*;
public class useiterator {
  public static void main(String[] args) {
    Collection<String> names = new ArrayList<>();
    names.add("esha");
    names.add("eshaan");
    names.add("eshaanvi");
    names.add("eshaanvika");
    Iterator<String> it = names.iterator();
    while(it.hasNext()) {
      String name = it.next();
      System.out.println(name);
    }
  }
}
