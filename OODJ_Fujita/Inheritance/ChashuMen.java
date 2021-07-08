package OODJ_Fujita.Inheritance;

public class ChashuMen extends Ramen
{
  private int chashu;

  // コンストラクタ
  ChashuMen()
  {
    super();
    System.out.println("チャーシューメン作るよ");
  }

  // // 継承におけるコンストラクタのオーバーロード
  // ChashuMen(int men, int katasa, Taste taste)
  //   {
  //     super(men, katasa, taste);
  //     System.out.println("指定済みのチャーシューメン作るよ");
  //   }

  // メソッド
  public void setChashu(int chashu)
  {
    this.chashu = chashu;
    System.out.println("チャーシュー：" + chashu);
  }

  public void checkChashuMen()
    {
      System.out.print("チャーシュー：" + chashu);
      if(soup != Taste.しょうゆ) // Ramenクラスのsoupフィールドがprivateの時、soupの代わりに「getSoup()」を使って値を取得する
      {
        System.out.println("\nしょうゆ味でないチャーシューメンはチャーシューメンではない！");
        System.out.println("しょうゆ味に変えます！");
        setSoup(Taste.しょうゆ);
      }
    }
}
