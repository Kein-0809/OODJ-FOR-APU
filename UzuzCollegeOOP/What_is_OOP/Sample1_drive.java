package UzuzCollegeOOP.What_is_OOP;

public class Sample1_drive {
  public static void main(String[] args) {

    //シナリオ①：車を場に登場させる(Sample1_car.javaファイルにある「Sample1_carクラス」のインスタンス化)
    System.out.println("▼シナリオ①：車を場に登場させる-----------------------------------------");

    Sample1_car mocoCar = new Sample1_car();
    Sample1_car chocoCar = new Sample1_car();


    //シナリオ②：車の情報(初期)の確認(mocoCarインスタンスのフィールドの確認)
    System.out.println("▼シナリオ②：車の情報(初期)の確認(mocoCarインスタンスのフィールドの確認)-----------------");

    System.out.println("< mocoCar >");
    System.out.println("mocoCar.carModel: " + mocoCar.carModel);
    System.out.println("mocoCar.owner: " + mocoCar.owner);
    System.out.println("mocoCar.color: " + mocoCar.color);
    System.out.println("mocoCar.speed: " + mocoCar.speed);
    System.out.println("mocoCar.right: " + mocoCar.right);


    //シナリオ③：車の情報(初期)の確認(chocoCarインスタンスのフィールドの確認(speedのみ))
    System.out.println("▼シナリオ③：車の情報(初期)の確認(chocoCarインスタンスのフィールドの確認(speedのみ))-----------------");

    System.out.println("< chocoCar >");
    System.out.println("chocoCar.speed: " + chocoCar.speed);


    //シナリオ④：acceleratorメソッドの起動＆確認
    System.out.println("▼シナリオ④：c");

    mocoCar.accelerator();

    System.out.println("< mocoCar >");
    System.out.println("mocoCar.carModel: " + mocoCar.carModel);
    System.out.println("mocoCar.owner: " + mocoCar.owner);
    System.out.println("mocoCar.color: " + mocoCar.color);
    System.out.println("mocoCar.speed: " + mocoCar.speed);
    System.out.println("mocoCar.right: " + mocoCar.right);

    System.out.println("< chocoCar >");
    System.out.println("chocoCar.speed: " + chocoCar.speed);

  }
}
