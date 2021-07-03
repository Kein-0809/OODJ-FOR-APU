package UzuzCollegeOOP.Inheritance02;

//! ToyPoodleクラスがサブ、Dogクラスがスーパー
class Sample2_05_1_ToyPoodle extends Sample2_05_1_Dog {
	
	//---フィールド-------------------------------------
	
	String name  ; //名前
	String skill ; //特技
	
	//---コンストラクタ---------------------------------
	//! 引数なしコンストラクタ
	Sample2_05_1_ToyPoodle(){
		// 「super()」が何も書かれていなかったら、暗黙的に引数なしの「super()」が呼び出される
		this.name  = "未設定（name）" ;
		this.skill = "未設定（skill）" ;
	}
	//! 引数1つありのコンストラクタ
	Sample2_05_1_ToyPoodle(String v){
		super( v );
		this.name  = "未設定（name）" ;
		this.skill = "未設定（skill）" ;
	}
	//! 引数3つありのコンストラクタ
	Sample2_05_1_ToyPoodle(String n , String s , String v){
		super( v );
		this.name  = n ;
		this.skill = s ;
	}
	
	//---メソッド---------------------------------------
	
	//特技を実行
	void doSkill(){
		System.out.println( skill ) ;
	}
}
