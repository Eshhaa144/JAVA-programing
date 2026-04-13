import java.util.*;
public class usearraylist {
  public static void main(String[] args) {
    ArrayList<String> fruit = new ArrayList<String>();
    fruit.add("apple");
    fruit.add("banana");
    fruit.add("grapes");
    //traversing list through iterator
    Iterator<String> it=fruit.iterator();//getting the iterator
    while(it.hasNext()) {//checking if iterator has the elements
      System.out.println(it.next());
    }
  }
  
}
