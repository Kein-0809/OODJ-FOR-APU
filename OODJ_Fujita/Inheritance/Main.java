package OODJ_Fujita.Inheritance;

public class Main
{
  public static void main(String[] args)
  {
    //ラーメンくれ
    System.out.println("===ラーメン===");
    Ramen ramen1 = new Ramen();
    ramen1.setMen(5);
    ramen1.setKatasa(2);
    ramen1.setSoup(Taste.しょうゆ);
    ramen1.checkRamen();
    // //固めん10盛りのみそラーメンくれ
    // System.out.println("===固めん，10盛り，みそ===");
    // Ramen ramen2 = new Ramen();
    // ramen2.setKatasa(1);
    // ramen2.setMen(10);
    // ramen2.setSoup(Taste.みそ);
    // ramen2.checkRamen();
    // //チャーシューメン
    // System.out.println("===普通のチャーシューメン===");
    // ChashuMen chashuMen = new ChashuMen();
    // chashuMen.setMen(5);
    // chashuMen.setKatasa(2);
    // chashuMen.setChashu(5);
    // chashuMen.setSoup(Taste.みそ);
    // chashuMen.checkRamen();
    // System.out.println("===指定のラーメン===");
    // Ramen RamenNormal = new Ramen(5,2,Taste.みそ);
    // RamenNormal.checkRamen();
    // System.out.println("===普通のチャーシューメン===");

    // // 継承におけるコンストラクタのオーバーロード
    // ChashuMen chashuMenNormal = new ChashuMen(2,5,Taste.みそ);
    // chashuMenNormal.setChashu(5);
    // chashuMenNormal.checkRamen();
  }
}
