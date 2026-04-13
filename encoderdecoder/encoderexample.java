import java.util.*;

public class encoderexample {
  public static void main(String[] args) {
    String original = "esha";
    String encode = Base64.getEncoder().encodeToString(original.getBytes());
    System.out.println("original string: " + original);//ZXNoYQ==
    System.out.println("encoded string: " + encode);


    //encode to decode
    String encodedval="ZXNoYQ==";
    byte[] decodebyte=Base64.getDecoder().decode(encodedval);

    String str=new String(decodebyte);
    System.out.println("decode value : "+str); 

    String encodedval1="==QYoNXZ";
    byte[] decodebyte1=Base64.getDecoder().decode(encodedval1);

    String str1=new String(decodebyte1);
    System.out.println("decode value : "+str1); 
  }
}
