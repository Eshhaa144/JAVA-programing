 class myexpception extends Exception
 {
  myexpception(String msg)
  {
    super(msg);  //this super will call the constructor of the parent class (Exception) and pass the message to it, which can be retrieved later using the getMessage() method.
  }
}
public class myex6 {
  public static void main(String[] args) {
      int age=19;
      try{
        if(age<18)
        {
          throw new myexpception("age is less than 18");
        }
        else
          
        {
          System.out.println("age is valid");
        }
      }
      catch(myexpception ex)
      {
        System.out.println("error is: "+ex.getMessage());
      }
       finally
       {
         System.out.println("end of program");
       }
      }
}
