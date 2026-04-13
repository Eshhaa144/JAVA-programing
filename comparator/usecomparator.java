import java.util.*;
class studentinfo{
  int id;
  String name;
  int age;
  studentinfo(int id , String name, int age){
    this.id=id;
    this.name=name;
    this.age=age;
  }
}
class sortbyage implements Comparator<studentinfo>
{
  public int compare(studentinfo s1,studentinfo s2)
  {
  
    return s1.age-s2.age;
  }
}
class sortbyname implements Comparator<studentinfo>
{
  public int compare(studentinfo s1,studentinfo s2)
  {
    return s1.name.compareTo(s2.name);
  }
}

public class usecomparator {
  public static void main(String[] args) {
    ArrayList<studentinfo> list=new ArrayList<>();
    list.add(new studentinfo(101,"esha", 20));
    list.add(new studentinfo(102,"prahlad",19));
    list.add(new studentinfo(103, "khushi", 20));
    System.err.println("ID\tName\tAge");
    for(studentinfo s:list)
    {
      System.out.println(s.id+" "+s.name+" "+s.age);
    }

    Collections.sort(list,new sortbyage());
    System.out.println("\nAfter sorting by age:" );
    System.err.println("ID\tName\tAge");
    for(studentinfo s:list)
    {
      System.out.println(s.id+" "+s.name+" "+s.age);
    }
    Collections.sort(list,new sortbyname());
    System.out.println("\nAfter sorting by name:" );
    System.err.println("ID\tName\tAge");
    for(studentinfo s:list) 
    {
      System.out.println(s.id+" "+s.name+" "+s.age);
    }

  }
}
