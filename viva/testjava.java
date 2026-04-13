import java.util.*;
public class testjava {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<>();
    System.out.println("enter no. of students: ");
    int n = sc.nextInt();
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    double avg=0;
    for (int i = 0; i < n; i++) {
      System.out.println("enter marks of student " + (i + 1) + ": ");
      int marks = sc.nextInt();
      nums.add(marks);
    }
    for(int i=0;i<n;i++)
    {
      System.out.println("student " + (i + 1) + " marks: " + nums.get(i));
      avg+=nums.get(i);
      if(nums.get(i)>max)
      {
        max=nums.get(i);
      }
      if(nums.get(i)<min)
      {
        min=nums.get(i);
      }
    }
    System.out.println("maximum marks: "+max);
    System.out.println("minimum marks: "+min);
    System.out.println("average marks: "+avg/n);
  }
}
