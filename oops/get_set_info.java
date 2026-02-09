class studentinfo
{
  int id;
  String name;
  String course;
  void setInfo()
  {
    id=123;
    name="esha";
    course="B.Tech";
  }
  void getInfo()
  {
    System.out.println("ID="+id);
    System.out.println("name="+name);
    System.out.println("course="+course);
  }
}
public class get_set_info
{
  public static void main(String [] arg)
  {
    studentinfo stfu=new studentinfo();
    stfu.setInfo();
    stfu.getInfo();
  }
}