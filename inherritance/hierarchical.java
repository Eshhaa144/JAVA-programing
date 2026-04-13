class AKTU
{
  void exam()
  {
    System.out.println("semester exams are starting soon......");
  }
}
class UCER extends AKTU
{
  void sessional()
  {
    System.out.println("sessional are starting soon.....");
  }
}
class BBS extends AKTU
{
  void sessional()
  {
     System.out.println("sessional 2 are starting soon.....");
  }
}
class hierarchical{
  public static void main(String[] arg)
  {
    UCER ucer=new UCER();
    BBS bbs=new BBS();
    bbs.exam();
    bbs.sessional();
    ucer.sessional();
    ucer.exam();
  }
}