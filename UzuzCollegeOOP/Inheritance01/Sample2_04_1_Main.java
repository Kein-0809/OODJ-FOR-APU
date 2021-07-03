package UzuzCollegeOOP.Inheritance01;

class Sample2_04_1_Main {
	public static void main (String[] args) {
		
		//シナリオ①：車を場に登場させる（Sample2_01_1_carクラスのインスタンス化）
		
		Sample2_04_1_Moco moco = new Sample2_04_1_Moco();
		
		
		//シナリオ②：「Sample2_04_1_Moco」クラスのメンバの使用
		System.out.println("▼シナリオ②：「Sample2_04_1_Moco」クラスのメンバの使用-----------------") ;
		
		System.out.println( moco.name ) ;
		moco.cuteStretch() ;
		
		
		//シナリオ②：「Sample2_04_1_Dog」クラスのメンバの使用
		System.out.println("▼シナリオ③：「Sample2_04_1_Dog」クラスのメンバの使用------------------") ;
		
		System.out.println( moco.type ) ; //「type」というフィールドは、Mocoクラスが継承している「Dogクラス」にある．Moco -> Dog
		moco.bark() ;                     //「bark()」というメソッドは、Mocoクラスが継承している「Dogクラス」にある．Moco -> Dog
		
		
		//シナリオ②：「Sample2_04_1_Mammals」クラスのメンバの使用
		System.out.println("▼シナリオ④：「Sample2_04_1_Mammals」クラスのメンバの使用--------------") ;
		
		System.out.println( moco.group ) ; //「group」というフィールドは、Mocoクラスが継承している,Dogクラスが継承している、「Mammalsクラス」にある．Moco -> Dog -> Mammals
		moco.breatheLungs() ;              //「breatheLungs()」というメソッドは、Mocoクラスが継承している,Dogクラスが継承している、「Mammalsクラス」にある．Moco -> Dog -> Mammals
		
		
	}
}

