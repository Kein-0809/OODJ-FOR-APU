package UzuzJankenOOP;
import java.util.Scanner;

public class capJanken {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Player1を入力してください");
    String player1 = scanner.next();
    System.out.println("Player2を入力してください");
    String player2 = scanner.next();
    String referee = "審判さん";

    //インスタンス化
    capPlayer pl1 = new capPlayer(player1);
    capPlayer pl2 = new capPlayer(player2);
    capReferee ref = new capReferee(referee);

    for(int i = 0; i <10; i++){
      
      ref.sayJanken();
      // pl1のじゃんけんで何をだすか決める
      pl1.makeHandStatus();
      // pl2のじゃんけんで何をだすか決める
      pl2.makeHandStatus();
      ref.showHandStatus(pl1.getName(), pl1.getHandStatus()); //pl1の手の内公開
      ref.showHandStatus(pl2.getName(), pl2.getHandStatus()); //pl2の手の内公開
      ref.sayResult();
      // refereeが勝敗を判定する処理
      ref.judgeJanken(pl1.getName(), pl1.getHandStatusNumber(), pl2.getName(), pl2.getHandStatusNumber());
    }

  }
}
