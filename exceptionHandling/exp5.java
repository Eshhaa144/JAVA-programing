public class exp5 {
  public static void main(String[] args) {
    int arr[]={10,20,30,40,50};
    try{
      for(int i=0;i<=arr.length;i++)
      {
        System.out.println("element is: "+arr[i]);
      }
    }
    catch(Exception ex)
    {
      System.out.println("error is: "+ex.getMessage());
    }
    finally
    {
      System.out.println("end of qwrtyuio program");
    }
  }
}
