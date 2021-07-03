package UzuzCollegeOOP.Static;

class Sample2_06_1_Main {
	public static void main (String[] args) {
		
		//シナリオ①：Sample2_06_1_Dogクラスのstaticメンバにアクセスできることを確認
		System.out.println("▼シナリオ①：Sample2_06_1_Dogクラスのstaticメンバにアクセスできることを確認") ;
		System.out.println( Sample2_06_1_Dog.SCIENTIFIC_NAME ) ; //! 「静的メンバ(staticがついているフィールド、メソッド)」にのみアクセスするからインスタンス化前でも値を取り出せる
		System.out.println( Sample2_06_1_Dog.getDogNumber() ) ; //! 「静的メンバ(staticがついているフィールド、メソッド)」にのみアクセスするからインスタンス化前でも値を取り出せる
		
		//シナリオ②：Sample2_06_1_Dogよりインスタンス化&フィールドの確認
		System.out.println("▼シナリオ②：Sample2_06_1_Dogよりインスタンス化&フィールドの確認") ;
		
		System.out.println("＜1体目＞-----------------") ;
		Sample2_06_1_Dog moco  = new Sample2_06_1_Dog("ToyPoodle"      ,"MOCO" ); //! 「Sample2_06_1_Dog」クラスをもとに「moco」という変数名の「インスタンスオブジェクト」を作った
		System.out.println( moco.getStatus() ) ;
		
		System.out.println("＜2体目＞-----------------") ;
		Sample2_06_1_Dog choco = new Sample2_06_1_Dog("WelshCorgi"     ,"CHOCO"); //! 「Sample2_06_1_Dog」クラスをもとに「choco」という変数名の「インスタンスオブジェクト」を作った
		System.out.println( moco.getStatus() ) ;
		System.out.println( choco.getStatus() ) ;
		
		System.out.println("＜3体目＞-----------------") ;
		Sample2_06_1_Dog pochi = new Sample2_06_1_Dog("GoldenRetriever","POCHI"); //! 「Sample2_06_1_Dog」クラスをもとに「pochi」という変数名の「インスタンスオブジェクト」を作った
		System.out.println( moco.getStatus() ) ;
		System.out.println( choco.getStatus() ) ;
		System.out.println( pochi.getStatus() ) ;
		
		//シナリオ③：各オブジェクトからstaticメンバへのアクセスの確認
		System.out.println("▼シナリオ③：各オブジェクトからstaticメンバへのアクセスの確認") ;
		
		//! クラスオブジェクトからでもインスタンスオブジェクトからでもクラスオブジェクトのメンバである「静的メンバ(staticがついているフィールド、メソッド)」にアクセスできる
		System.out.println("＜クラスオブジェクトからのアクセス＞");
		System.out.println( Sample2_06_1_Dog.SCIENTIFIC_NAME ) ;
		System.out.println( Sample2_06_1_Dog.getDogNumber() ) ;
		
		System.out.println("＜インスタンスオブジェクトからのアクセス＞");
		System.out.println( moco.SCIENTIFIC_NAME ) ;
		System.out.println( moco.getDogNumber() ) ;
		
		
		
	}
}

