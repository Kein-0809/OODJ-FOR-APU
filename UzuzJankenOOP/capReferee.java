package UzuzJankenOOP;

public class capReferee {
  // フィールド
  private String name;

  // コンストラクタ
  capReferee(String n){
    this.name = n;
  }

  // Getter
  public String getName(){
    return this.name;
  }

  // メソッド
  public void sayJanken(){
    System.out.println(getName() + "「じゃんけん・・・ぽん！！！！！」");
  }

  public void showHandStatus(String playerName,String hs){
    System.out.println(getName() + " 「" + playerName + "さんの手は" + hs + "でした！」");
  }

  public void sayResult(){
    System.out.println(getName() + "「結果は・・・」");
  }

  public void judgeJanken(String playerName1, int pl1handstatus, String playerName2, int pl2handstatus){
    if(pl1handstatus > pl2handstatus) {
      System.out.println(playerName1 + " さんの勝利");
    }else if(pl2handstatus > pl1handstatus){
      System.out.println(playerName2 + " さんの勝利");
    }else{
      System.out.println("あいこ！勝負つかず！");
    }
  }

}
