import java.util.HashMap;
import java.util.Scanner;
public class hm1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //create hashmap obj called playerscore
    HashMap<String,Integer> player=new HashMap<String,Integer>();
    System.out.println("enter no. of players: ");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
      System.out.println("enter name of "+i+" player : ");
      String name=sc.next();
      System.out.println("enter score of "+i+" player : ");
      int run=sc.nextInt();
      player.put(name,run);
    }
    System.out.println("player name and score are : "+player);


    
  }
}
