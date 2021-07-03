package UzuzCollegeOOP.Inheritance01;

class Sample2_04_2_Moco extends Sample2_04_2_Dog {
	
	//---フィールド-------------------------------------
	
	String name = "MOCO" ; //名前
	
	//---メソッド---------------------------------------
	
	//かわいくストレッチ（UZUZの就活犬MOCOちゃんの特技）
	void cuteStretch(){
		System.out.println("かわいくストレッチ！") ;
	}
	
	//スーパークラスも含め、すべてのフィールドの情報を表示
	void printAllInfo(){
		System.out.println( "name:" + name + " / type:" + type + " / group:" + group ) ;
		// 「nameフィールド」は「Mocoクラス」から、
		//「typeフィールド」は「Dogクラス」から、
		//「groupフィールド」は「Mammalsクラス」から参照している
	}
	
	//スーパークラスも含め、すべてのメソッドを実行 ※printAllInfoメソッドは除く
	void executeAllAction(){
		cuteStretch() ; // Mocoクラスから参照
		bark() ;        // Dogクラスから参照
		breatheLungs() ;// Mammalsクラスから参照
	}
	
}
