package UzuzCollegeOOP.ETC_OOP_Knowledge;

//! Abstractクラスはインスタンス化が不可能
//! Abstractメソッドはオーバーライドしないといけない
abstract class Sample2_07_1_AbstractTruck { //! ←抽象クラス
	
	//---抽象メソッド------------------------------------------------
	
	//acceleratorメソッド（現在の速度を上げる）
	abstract void accelerator() ; //! 「{}」の代わりに首尾には「;」をつける
	
	//brakeメソッド（現在の速度を下げる）
	abstract void brake() ;
	
	//paintメソッド（色を塗る）
	abstract void paint( String cl ) ;
	
}
