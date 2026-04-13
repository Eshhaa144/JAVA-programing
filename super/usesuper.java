//super keyword always refer to parent meth
class demo {
  void display() {
    System.out.println("this is a display meth");
  }
}

class derivedclass extends demo {
  void display() {
    System.out.println("this is a display meth of derived class");
  }

  void next() {
    display();
    super.display();
  }
}

public class usesuper {
  public static void main(String[] args) {
    derivedclass dc = new derivedclass();
    dc.display();
    dc.next();
  }
}