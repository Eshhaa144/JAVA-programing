class pro1 extends Thread {
  public void run() {
    
    try {
      for (int i = 1; i <= 10; i++) {
        System.out.println(" 5 X " + i + " = " + i * 5);
        Thread.sleep(1000);

      }
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}

class pro2 extends Thread {
  public void run() {
    try {
      for (int i = 1; i <= 10; i++) {
        System.out.println("10 X " + i + " = " + i * 10);
        Thread.sleep(500);
      }
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}

public class thread2 {
  public static void main(String[] arg) {
    pro1 obj1 = new pro1();
    pro2 obj2 = new pro2();
    obj1.start();
    
    obj2.start();
    

  }
}
