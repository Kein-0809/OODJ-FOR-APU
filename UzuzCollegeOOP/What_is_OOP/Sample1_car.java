package UzuzCollegeOOP.What_is_OOP;

public class Sample1_car {

  //---フィールド(クラス直下で定義された変数)-------------------------------
  String carModel = "クーペ"; //車種名
  String owner = "モコ"; //オーナー
  String color = "RED"; //色
  int speed = 0; //現在の速度
  boolean right = false; //ライト(true:点灯/false:消灯)


  //デフォルトコンストラクタ
  //Sample1_car.javaのようにインスタンスにコンストラクタがない場合、裏で、
  //Sample1_car(){}
  //を勝手に補ってくれる

  //しかしながら↓の引数を用いた自作コンストラクタを一つでも書いたら
  //デフォルトコンストラクタは生成されない

  //引数を用いた自作のコンストラクタ
  //Sample1_car(int x){}


  //---メソッド-------------------------------
  //acceleratorメソッド(現在の速度を1km/h上げる)
  void accelerator(){
    speed++;
    System.out.println("(少し速くなった)");
  }

  //brakeメソッド(現在の速度を1km/h下げる)
  void brake(){
    speed--;
    System.out.println("(少し遅くなった)");
  }

  //rightOnメソッド(ライトを点灯させる)
  void rightOn(){
    right  = true;
    System.out.println("(周囲が明るくなった)");
  }

  //rightOffメソッド(ライトを消灯させる)
  void rightOff(){
    right  = false;
    System.out.println("(周囲が暗くなった)");
  }

  //klaxonメソッド(クラクションを鳴らす)
  void klaxon(){
    System.out.println("「プップーーーーーーーーーーーーーーーーーーッ！」");
  }
}
