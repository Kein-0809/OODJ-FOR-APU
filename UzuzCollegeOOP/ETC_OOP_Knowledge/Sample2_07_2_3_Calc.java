package UzuzCollegeOOP.ETC_OOP_Knowledge;

class Sample2_07_2_3_Calc {
	void calc (int x , int y) {
		
		try{
			
			System.out.println( x / y ) ;                  //コマンドライン引数2が0→①
			
		}catch(ArithmeticException e){                      //ゼロ割が発生した場合の対処
			System.out.println("[ERROR]例外を検知しました") ;
			e.printStackTrace();
		}catch(NumberFormatException e){                    //数字の形式でない文字列が入力された場合の対処
			System.out.println("[ERROR]例外を検知しました") ;
			e.printStackTrace(); //! 「printStackTrace()」は、例外オブジェクトをもとに例外が発生した場所を明確に突き止めてくれる．1行目はエラーが出た場所、2行目からはそのエラーの要因であろうものの発生源を近い順番に提示する
		}finally{ //! 「finally」は、例外が発生するしないに関わらず必ず実行される
			System.out.println("★finally（Sample2_07_2_3_Calcクラス）") ;
		}
		
	}
}

