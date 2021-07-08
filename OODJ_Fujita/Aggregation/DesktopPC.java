package OODJ_Fujita.Aggregation;

public class DesktopPC
{
  Display display;
  Mouse mouse;
  Keyboard keyboard;

   // コンストラクタ
  DesktopPC()
  {
    System.out.println("Desktop PC");
  }

  // メソッド
  public void setup()
  {
    display = new Display();
    mouse = new Mouse();
    keyboard = new Keyboard();
  }
  
  public void initialize()
  {
    display.check();
    mouse.check();
    keyboard.check();
  }
}