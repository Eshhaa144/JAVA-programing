class process1 extends Thread
{
  public void run()
  {
    for(int i=1;i<=10;i++)
    {
      System.out.println("i= "+i);
    }
  }
}
class process2 extends Thread
{
  public void run()
  {
    for(int i=11;i<=20;i++)
    {
      System.out.println("i= "+i);
    }
  }
}

public class thread1 {
  public static void main(String[] args) {
    process1 obj1=new process1();
    process2 obj2=new process2();
    obj1.start();
    obj2.start();
    //run methond is called by start() method....dono simultaneously chalre hai...kabhi obj1 kabhi obj2
  }
}
