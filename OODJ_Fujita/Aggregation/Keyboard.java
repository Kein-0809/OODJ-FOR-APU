package OODJ_Fujita.Aggregation;

public class Keyboard {
  private boolean status;

  // コンストラクタ
  Keyboard()
  {
    status = false;
    switchButton();
  }

  // メソッド
  public void switchButton()
  {
    if(status)
    {
      status = false;
      System.out.println("Keyboard switch off");
    }
    else
    {
      status = true;
      System.out.println("Keyboard switch on");
    }
  }
  
  public void check()
  {
    if(status)
    {
      System.out.println("Keyboard status Success");
    }
    else
    {
      System.out.println("Keyboard status Fail");
    }
  }
}
