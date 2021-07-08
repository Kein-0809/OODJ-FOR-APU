package OODJ_Fujita.Composition;

public class KeyboardParts {
  private boolean status;

  // コンストラクタ
  KeyboardParts()
  {
    status = true;
  }

  // メソッド
  public void check()
  {
    if(status)
    {
      System.out.println("KeybordParts status Success");
    }
    else
    {
      System.out.println("KeybordParts status Fail");
    }
  }
}
