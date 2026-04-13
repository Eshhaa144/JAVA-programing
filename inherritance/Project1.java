////////////////////project of multilevel inherritance////////////////////

class company
{
  public int id;
  public String name;
  public double salary;
  company()
  {
    id=101;
    name="esha";
    salary=100000;
    System.out.println("id :"+id);
    System.out.println("name :"+name);
    System.out.println("salary :"+salary);

  }
}
class alloance extends company
{
  public double ta,da,hra;
  alloance()
  {
    ta=salary*95/100;
    da=salary*90/100;
    hra=salary*45/100;
    salary=ta+da+hra;
    System.out.println("after allowance salary is :"+salary);
  }
}
class bonus extends alloance
{
  bonus()
  {
     salary=salary+10000;
    System.out.println("after bonus salary is :"+salary);
  }

}

class Project1
{
  public static void main(String[] arg)
  {
      //company com=new company();
      //alloance all=new alloance();
      bonus bon=new bonus();
  }
}