public class evenodd {
  public static void main(String[] args) {
    int num=4;
    String res= switch(num%2)
    {
      case 0:{
        System.out.println("number is eveniyaa");
        int sq=num*num;
        yield "square is "+sq;
      }
      case 1:{
        System.out.println("number is oddiyaaa");
         int cube=num*num*num;
        yield "cube is "+cube;
      }
     default :{
      yield "invalid";
     }
    };
     System.out.println(res);
  }
}
