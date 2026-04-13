import java.util.*;
public class letter {
  public static void main(String[] args) {
    System.out.println("enter the string");
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int vcount=0, ccount=0, scount=0,wcount=0,count=0;
    try{
      for(int i=0;i<str.length();i++)
      {
        char ch=str.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
          vcount++;
        }
        else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
          ccount++;
        }
        else if(ch==' ')
        {
          scount++;
          wcount=scount+1;
        }
          count++;
      }
      System.out.println("vowels count is: "+vcount);
      System.out.println("consonants count is: "+ccount);
      System.out.println("spaces count is: "+scount);
      System.out.println("words count is: "+wcount);
      System.out.println("Total characters count is: "+count);
    }
    // for(int i=0;i<str.length();i++)
    // {
    //   char ch=str.charAt(i);
    //   if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
    //   {
    //     vcount++;
    //   }
    //   else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
    //   {
    //     ccount++;
    //   }
    //   else if(ch==' ')
    //   {
    //     wcount++;
    //   }
    //   else
    //   {
    //     scount++;
    //   }
    // }
    // System.out.println("vowels count is: "+vcount);
    // System.out.println("consonants count is: "+ccount);
    // System.out.println("spaces count is: "+wcount);
    // System.out.println("special characters count is: "+scount);
    catch(Exception ex)
    {
      System.out.println("error is: "+ex.getMessage());
    }
    finally
    {
      System.out.println("end of program");
    }
  }
}
