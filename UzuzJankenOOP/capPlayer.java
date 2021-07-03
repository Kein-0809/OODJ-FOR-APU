package UzuzJankenOOP;

public class capPlayer {
  // フィールド
  private String name;
  private String handStatus;
  private int handStatusNumber;

  // コンストラクタ
  capPlayer(String n){
    this.name = n;
  }

  //メソッド
  public void makeHandStatus(){
    // int型変数iを宣言
    int i;
    // randomメソッドで0以上3未満の整数を生成
    i = (int)(Math.random()*3);
    this.handStatusNumber = i;
    String[] hand = {"グー","チョキ","パー"};
    this.handStatus = hand[i];
  }

  // Getter/Setter
  public String getName(){
    return this.name;
  }
  // public void setName(String n) {
  //   this.name = n;
  // }

  public String getHandStatus(){
    return this.handStatus;
  }
  // public void setHandStatus(String hs) {
  //   this.handStatus = hs;
  // }

  public int getHandStatusNumber(){
    return this.handStatusNumber;
  }
}
