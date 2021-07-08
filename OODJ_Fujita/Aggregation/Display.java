package OODJ_Fujita.Aggregation;

public class Display {
  private boolean status;

  // コンストラクタ
  Display()
  {
    status = false;
    switchButton();
  }

  // メソッド
  public void switchButton()
  {
    if(status)
    { // 「status = true」の時実行
      status = false;
      System.out.println("Display  Switch off");
    }
    else
    { // 「status = false」の時実行
      status = true;
      System.out.println("Display Switch on");
    }
  }
  
  public void check()
  {
    if(status)
    {
      System.out.println("Display status success");
    }
    else
    {
      System.out.println("Display  status fail");
    }
  }
}
