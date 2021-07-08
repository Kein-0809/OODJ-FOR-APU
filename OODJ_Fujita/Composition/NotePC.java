package OODJ_Fujita.Composition;

public class NotePC {
  LCD lcd;
  TouchPad touchpad;
  KeyboardParts keyboardparts;

  // コンストラクタ
  NotePC()
  {
    lcd = new LCD(); // インスタンス化 (実行された瞬間、LCDクラスに行ってコンストラクタを実行)
    touchpad = new TouchPad(); // インスタンス化
    keyboardparts = new KeyboardParts(); // インスタンス化
  }

  // メソッド
  public void initialize()
  {
    lcd.check();
    touchpad.check();
    keyboardparts.check();
  }
}
