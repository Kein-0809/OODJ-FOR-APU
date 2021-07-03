package UzuzJankenOOP;

import java.util.Scanner;

public class Ex2_01_1_Janken {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Player1を入力してください");
    String player1 = scanner.next();
    System.out.println("Player2を入力してください");
    String player2 = scanner.next();

    //インスタンス化
    Ex2_01_1_Player pl1 = new Ex2_01_1_Player(player1);
    Ex2_01_1_Player pl2 = new Ex2_01_1_Player(player2);
    
    for(int i=0; i<10; i++){
      System.out.println("じゃんけん・・・ぽん！！！！！");
      pl1.makeHandStatus();
      pl2.makeHandStatus();
      System.out.println(pl1.name + " さんの手: " + pl1.handStatus);
      System.out.println(pl2.name + " さんの手: " + pl2.handStatus);
      System.out.println("結果は・・・");
      if(pl1.handStatusNumber > pl2.handStatusNumber) {
        System.out.println(pl1.name + " さんの勝利");
      }else if(pl2.handStatusNumber > pl1.handStatusNumber){
        System.out.println(pl2.name + " さんの勝利");
      }else{
        System.out.println("あいこ！勝負つかず！");
      }
    }
  }
}
