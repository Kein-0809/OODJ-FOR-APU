package UzuzCollegeOOP.Static;

//! 「static」が付けられているものは「クラスオブジェクト」、付けられていないものは「インスタンスオブジェクト」が管理する
//! 「static」が付けられたフィールドとメソッドを総じて「静的メンバ」という
//! 「static」が付けられた「フィールド」を「クラス変数」と呼び、「メソッド」を「クラスメソッド」と呼ぶ
//! 「クラスオブジェクト」はインポート(ロード)のためのコンパイルが済んだ時点で出来上がってる．つまり実行前から出来上がっている(メモリ場に存在する)
//! 「static」はインスタンス化する前からメモリ上に存在するため、「main.java」クラス内でインスタンス化する前に「static」が着いたフィールドの値やメソッドを参照することができる
class Sample2_06_1_Dog {
	
	//---定数-------------------------------------------
	public static final String SCIENTIFIC_NAME = "Canis lupus familiaris" ; //学名：カニス・ルプス・ファミリアーリス //!クラス変数
	
	//---フィールド-------------------------------------
	private static int    dogsNumber = 0 ; //犬の全頭数（初期値：0）//!クラス変数
	private static String breed ;          //犬種 //!クラス変数
	private        String name  ;          //名前
	
	//---コンストラクタ---------------------------------
	Sample2_06_1_Dog(String br , String nm){
		this.dogsNumber++ ;  //インスタンス化されるたびにdogsNumberの値を＋１する
		this.breed = br ;
		this.name  = nm ;
	}
	
	//---メソッド---------------------------------------
	//getStatusメソッド
	public String getStatus(){ //! クラスメソッド
		return "犬の全頭数:" + this.dogsNumber + " / 名前:" + this.name + " / 犬種:" + this.breed ;
	}
	
	//getter（dogsNumber）
	public static int getDogNumber(){
		return dogsNumber ;
	}
}
