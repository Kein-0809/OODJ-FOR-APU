package OODJ_Fujita.Composition;

public class TouchPad {
  private boolean status;

  // コンストラクタ
  public TouchPad()
  {
      status = true;
  }

  // メソッド
  public void check()
  {
    if(status)
    {
      System.out.println("TouchPad status Success");
    }
    else
    {
      System.out.println("TouchPad status Fail");
    }
  }

}
