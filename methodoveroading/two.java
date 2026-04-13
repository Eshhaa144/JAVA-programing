class shape{
  double area(double radius)
  {
    return Math.PI*(radius*radius);
  }
  double area(int l,int b)
  {
    return l*b;
  }
  double area(double base,double height)
  {
    return 0.5*base*height;
  }
}
class two{
  public static void main(String[] arg)
  {
    shape obj=new shape();
    System.out.println("area of circle: "+obj.area(30));
     System.out.println("area of rect: "+obj.area(13,85));
      System.out.println("area of triangle: "+obj.area(12.0,15.5));
  }
}