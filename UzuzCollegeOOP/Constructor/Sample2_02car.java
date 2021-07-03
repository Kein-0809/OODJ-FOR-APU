package UzuzCollegeOOP.Constructor;

public class Sample2_02car {
  //---フィールド（クラス直下で定義された変数）----------------
	
	String  carModel ;  //車種名
	String  owner    ;  //オーナー
	String  color    ;  //塗装色
	int     speed    ;  //現在の速度
	boolean right    ;  //ライト（true:点灯/false:消灯）
	
	//---コンストラクタ------------------------------------------------
	
	//コンストラクタ①（引数なし）
	Sample2_02car(){
		System.out.println("　　▼コンストラクタ①（引数なし）-------------------------") ;
		carModel = "未登録" ;  //車種名 //! ここで String carModel = "未登録" ;のようにするとうまく値が代入されない
		owner    = "未登録" ;  //オーナー
		color    = "未登録" ;  //塗装色
		speed    = 0        ;  //現在の速度
		right    = false    ;  //ライト（true:点灯/false:消灯）
		System.out.println("　　▲-----------------------------------------------------") ;
	}
	
	//コンストラクタ②（引数あり）
		//! 「this()」というコンストラクタから、コンストラクタの呼び出しを行う時は、コンストラクタ内の先頭の行で実行されなければいけない
	Sample2_02car(String cm , String or , String cl , int sp , boolean rt ){
		this(); //! 15行目から始まる、コンストラクタ①（引数なし）の起動
		        //! 15行目から始まる、コンストラクタ①（引数なし）の起動が終えた後下にある処理に進む

		System.out.println("　　▼コンストラクタ②（引数あり）-------------------------") ;
		this.carModel = cm ;  //車種名 
		//! 「this」はインスタンス化された時に、そのインスタンスに割り当てる「変数名の代わりをしている」
		//! これは、「this.変数名」が「フィールド変数」をあらわすため
		//! 今回のケースでは、Sample2_02driveファイルにある「mainメソッド」の10、11行目で生成されるインスタンスの変数名「mocoCar」と「pochiCar」をthisでそれぞれ表している
		//! 基本的には、フィールドの参照では「this.変数名」の形をとり「フィールドと名前のかぶる仮引数(parameter)をかかない」
		this.owner    = or    ;  //オーナー
		this.color    = cl    ;  //塗装色
		this.speed    = sp    ;  //現在の速度
		this.right    = rt    ;  //ライト（true:点灯/false:消灯）
		//! ↓ 仮引数の変数名とフィールドの変数名が違うため、一応これでも値を参照することに成功はする
		// owner    = or    ;  //オーナー
		// color    = cl    ;  //塗装色
		// speed    = sp    ;  //現在の速度
		// right    = rt    ;  //ライト（true:点灯/false:消灯）
		//! ↓ ✖️このような感じで仮引数の変数名とフィールドの変数名が同一の時、値を参照することに失敗する
		// owner    = owner    ;  //オーナー
		// color    = color    ;  //塗装色
		// speed    = speed    ;  //現在の速度
		// right    = right    ;  //ライト（true:点灯/false:消灯）
		System.out.println("　　▲-----------------------------------------------------") ;
	}
	
	//---メソッド------------------------------------------------
	
	//acceleratorメソッド（現在の速度を1km/h上げる）
	void accelerator(){
		speed++ ;
		System.out.println(owner + "の車：（少し速くなった）") ;
	}
	
	//brakeメソッド（現在の速度を1km/h下げる）
	void brake(){
		speed-- ;
		System.out.println(owner + "の車：（少し遅くなった）") ;
	}
	
	//rightOnメソッド（ライトを点灯させる）
	void rightOn(){
		right = true ;
		System.out.println(owner + "の車：（周囲が明るくなった）") ;
	}
	
	//rightOffメソッド（ライトを消灯する）
	void rightOff(){
		right = false ;
		System.out.println(owner + "の車：（周囲が暗くなった）") ;
	}
	//klaxonメソッド（クラクションを鳴らす）
	void klaxon(){
		System.out.println(owner + "の車：「プップ～～～～～～～～～～ッ」") ;
	}
}