package OODJ_Fujita.Aggregation;

public class Main {
  public static void main(String args[])
    {
      System.out.println("デスクトップPC作るよ");
      DesktopPC iMoc = new DesktopPC();
      System.out.println("セットアップするよ");//
      iMoc.setup();
      System.out.println("立ち上げるよ");//
      iMoc.initialize();
    }
}

// 集約(Aggregation)は，部分のオブジェクトが集まって全体のオブジェクトを構成している関係を指す．全体のオブジェクトがなくなっても，部分はそれ自体で存在することができる．
// DesktopPCクラスがDisplayクラス,Keyboardクラス,Mouseクラスを「持っている」という表現ができるので，「has-a」関係と呼ぶことがある．全体における部分という意味で「part-of関係」と呼ぶこともある．
// 「全体」 has-a 「部分」という表現ができる．今の例でいうと，「DesptopPC」 has-a 「Display」と表現することができる．
// これは「部分」part-of「全体」という表現もできる．すなわち「Display」part-of「DesktopPC」となる．

