class min_max
{
  static void Maxele(int num[])
  {
    int max=num[0];
    for(int i=0;i<num.length-1;i++)
    {
      if(num[i]>max)
      {
        max=num[i];
      }
    }
    System.out.println("maximun element is "+max);
  }
  static void Minele(int num[])
  {
    int min=num[0];
    for(int i=0;i<num.length-1;i++)
    {
      if(num[i]<min)
      {
        min=num[i];
      }
    }
    System.out.println("min element is "+min);
  }
  
  public static void main(String [] arg)
  {
    int num[]={15,65,24,18,36,94,34};
    Maxele(num);
    Minele(num);
  }
  
}