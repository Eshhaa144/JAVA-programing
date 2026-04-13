class prog1
{
  void output()
  {
    System.out.println("output without static");
  }
  static void display()
  {
    System.out.println("display by with static");
  }
    public static void main(String [] arg)
    {
      prog1 obj= new prog1();
      obj.output();
      display();
    }
  
}