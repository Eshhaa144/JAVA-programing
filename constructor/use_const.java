class exam
{
  int id;
  String name;
  //....default constructor....//
  exam()
  {
    id=102;
    name="esha";
    System.out.println("name "+name);
    System.out.println("id "+id);
  }
  //....parameterised constructor....//
  exam(int i,String name)
  {
    id=i;
    this.name=name;
    System.out.println("id="+id);
    System.out.println("name "+name);
  }
  //....Copy constructor....//
  exam(exam e)
  {
    this.id= e.id;
    this.name=e.name;
    System.out.println("id="+id);
    System.out.println("name "+name);
  }
}
public class use_const{
  public static void main(String [] arg)
  {
    exam e1=new exam();
    exam e2=new exam(112,"gaureesh");
    exam e3=new exam(e2);
  }
}