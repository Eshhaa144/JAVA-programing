
import java.util.*;
public class queue1 {
  public static void main(String[] args) {
    PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
    queue.add(3);
    queue.add(7);
    queue.add(10);
    queue.add(37);
    queue.add(77);
    System.out.println(queue);
    System.out.println(queue.element());
    System.out.println("Peek element: "+queue.peek());
    Iterator it=queue.iterator();
    while(it.hasNext())
    {
      System.out.println(it.next());
    }
    System.out.println("Element popped from remove:"+queue.remove());
    System.out.println("Element popped from poll:"+queue.poll());
    Iterator it2=queue.iterator();
    while(it2.hasNext())
    {
      System.out.println(it2.next());
    }
  }
}