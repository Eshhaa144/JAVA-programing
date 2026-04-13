class data{
  void display(int id)
  {
    System.out.println("ID is :"+id);
  }
  void display(String name )
  {
    System.out.println("name is :"+name);
  }
  void display(int id,String name)
  {
    System.out.println("ID is :"+id);
    System.out.println("name is :"+name);
  }
}
class third{
  public static void main(String[] arg)
  {
    data obj=new data();
    obj.display(101);
    obj.display("esha");
    obj.display(102,"prahlad");
  }
}