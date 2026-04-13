public class switchc {
  public static void main(String[] args) {
    int ch = 3;
    String result = switch (ch) {
      case 1:{
        yield "monday";
      }
      case 2:{
        yield "tuesday";
      }
      default:{
        yield "invalid";
      }
      //if ek hi statement pass krna ho toh neeche wala use karengeee!!!!!!
      // case 1 -> "Monday";
      // case 2 -> "Tuesday";
      // case 3 -> "Wednesday";
      // case 4 -> "thrusday";
      // default -> "invalid";
    };
    System.out.println(result);
  }
}
