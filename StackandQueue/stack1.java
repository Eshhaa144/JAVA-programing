package StackandQueue;
import java.util.*;
public class stack1 {
  public static void main(String[] args) {
    Stack<Integer> stack=new Stack<>();
    stack.push(3);
    stack.push(7);
    stack.push(10);
    stack.push(37);
    stack.push(77);
    System.out.println(stack);
    System.out.println("Peek element: "+stack.peek());
    System.out.println("Popped element:"+stack.pop());
  }
}
