//super keyword always refer to parent meth
class a {
  a() {
    System.out.println("this is a a meth");
  }
}

class b extends a{
  b() {
    System.out.println("this is b meth");
  }
}  
class c extends b{
  c() {
    System.out.println("this is a display c meth");
  }
}

public class usesuper2 {
  public static void main(String[] args) {
    c obj=new c();  
  }
}

//OUTPUT: this is a a meth
//        this is b meth
//        this is a display c meth    (by just making obj of c teeno call hore hai as....by default jab sabka constructor banaya tab super automatically call hogya and c << extends b << extends ....so jab c ka obj banaya toh teeno call ho jaigaae!!!!)
