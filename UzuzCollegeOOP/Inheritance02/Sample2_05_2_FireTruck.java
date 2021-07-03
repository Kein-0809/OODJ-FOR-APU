package UzuzCollegeOOP.Inheritance02;

import UzuzCollegeOOPsample.Sample2_05_2_Car;

class Sample2_05_2_FireTruck extends Sample2_05_2_Car {
	
	//---フィールド------------------------------------------------------
	//※なし
	
	//---コンストラクタ--------------------------------------------------
	//※なし
	// Sample2_05_FireTruck(){}のような「デフォルトコンストラクタ」が自動的に呼ばれる
	// しかしながら今回のように何かしら継承をしているコンストラクタであれば「Sample2_05_FireTruck(){ super(); }」のように「super()」が自動的に呼ばれる
	
	//---メソッド--------------------------------------------------------
	
	// Carクラスにもある「paint()」メソッドをオーバーライド
	// オーバーライドの法則に従って、「戻り値」「変数名」「仮引数」は同一
	//paintメソッド（色を塗る）※セットできる塗装色は「RED」のみ
	public void paint( String cl ){
		if( cl.equals( "RED" ) ){
			super.color = cl ;
		}
	}
	
	// Carクラスにもある「accelerator()」メソッドをオーバーライド
	// オーバーライドの法則に従って、「戻り値」「変数名」「仮引数」は同一
	//acceleratorメソッド（現在の速度を1km/h上げる）※80km/h以上にはならないよう制御
	public void accelerator(){
		if( super.getSpeed() < 80 ){
			super.setSpeed( super.getSpeed() + 1 ) ;
		}
	}
	
}
