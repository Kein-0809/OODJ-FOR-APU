package UzuzJankenOOP;

public class Ex2_01_1_Player {
  String name;
  String handStatus;
  int handStatusNumber;

  // コンストラクタ
  Ex2_01_1_Player(String n){
    this.name = n;
  }

  //メソッド
  public void makeHandStatus(){
    //int型変数iを宣言
    int i;
    //randomメソッドで0以上3未満の整数を生成
    i = (int)(Math.random()*3);
    this.handStatusNumber = i;
    String[] hand = {"グー","チョキ","パー"};
    this.handStatus = hand[i];
  }
}
