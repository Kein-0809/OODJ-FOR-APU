package OODJ_Fujita.Composition;

public class LCD {
  private boolean status;

  // コンストラクタ
  LCD()
  {
    status = true;
  }

  // メソッド
  public void check()
  {
    if(status)
    {
      System.out.println("LCD status Success");
    }
    else
    {
      System.out.println("LCD status Fail");
    }
  }
}
