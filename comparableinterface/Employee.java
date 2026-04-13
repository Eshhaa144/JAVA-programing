import java.util.*;

public class Employee implements Comparable<Employee>{
  int id;
  String name;
  int salary;
  Employee(int id,String name,int salary)
  {
    this.id=id;
    this.name=name;
    this.salary=salary;
  }
  public int compareTo(Employee e)
  {
    if(this.salary>e.salary)
    {
      return 1;
    }
    else if(this.salary<e.salary)
    {
      return -1;
    }
    else
    {
      return 0;
    }
  }
}
 class prog1 {
  public static void main(String[] args) {
    //comparable interface
    //employee is a secondary data type create by the user
    Scanner s=new Scanner(System.in);
    ArrayList<Employee> emp = new ArrayList<>();
    System.out.println("Enter the number of employees:");
    int n=s.nextInt();
    for(int i=0;i<n;i++)
    {
      System.out.println("Enter details for employee "+(i+1)+":");
      System.out.println("Enter ID:");
      int id=s.nextInt();
      System.out.println("Enter name:");
      String name=s.next();
      System.out.println("Enter salary:");
      int salary=s.nextInt();
      emp.add(new Employee(id,name,salary));
    }
    System.out.println("Employee details:");
    System.out.println("ID\tName\tSalary");
    for(Employee e:emp)   {
      System.out.println(e.id+"\t"+e.name+"\t"+e.salary);
    }
    Collections.sort(emp);
    System.out.println("\nEmployee details after sorting:");
    System.out.println("ID\tName\tSalary");
    for(Employee e:emp)   {
      System.out.println(e.id+"\t"+e.name+"\t"+e.salary);
    }

  }
}
