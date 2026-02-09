class metharr
{
  static void revarray(int num[])
  {
    System.out.println("elem in rev order are..");
    for(int i=num.length-1;i>=0;i--)
    {
      System.out.println(num[i]);
    }
  }
  public static void main(String [] arg)
  {
    int num[]={15,65,24,18,36,94,34};
    revarray(num);
  }
  
}