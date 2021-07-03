package UzuzCollegeOOP.Inheritance02;

class Sample2_05_1_Dog {
	
	//---フィールド-------------------------------------
	
	String voice ; //鳴き声
	
	//---コンストラクタ---------------------------------
	//! 引数なしコンストラクタ
	Sample2_05_1_Dog(){
		this.voice = "ワンワン" ;
	}
	//! 引数1つありコンストラクタ
	Sample2_05_1_Dog(String v){
		this.voice = v ;
	}
	
	//---メソッド---------------------------------------
	
	//吠える
	void bark(){
		System.out.println( voice ) ;
	}
}
