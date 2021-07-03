package OOP_Yusha;

public class Yuusya extends Human {
	
	//コンストラクタ
	public Yuusya(){
		super.setName("ゆうしゃ"); // 「super」は継承元(Human)の値やメソッドを呼び出すことができる．このケースだとHumanクラスの中にある「setName(String name)メソッド」を呼び出す
		super.setGender(1);
		super.setLength(180);
		super.setWeight(70);
		super.setVitality(100);
		super.setMagic(5);
	}
	//! ↓クラス変数を引数に使う事で、インスタンスを代入出来る様になる。インスタンスを代入する事によってインスタンスのフィールド値を参照出来る様になる。
	public void specialAttack(Human target){ // 「specialAttack(クラス名 インスタンス名)」というメソッドを呼び出す際に、引数にHumanクラスのフィールドを値を参照できるようにする．つまり、「target」が「Humanクラス」を表す(指定する)インスタンス名の役目をしている
		// 勇者だけが持つ特有のメソッド
		String name = super.getName();
		super.setVitality(super.getVitality() - 20);
		System.out.println( name  + " の こうげき");
		System.out.println( name + " の ひっさつわざが さくれつした！");
		
		target.setVitality(target.getVitality() - 50);
		System.out.println( target.getName() + " に 50 のダメージを あたえた");
		
		super.setVitality(super.getVitality() - 10);
		System.out.println( name + " の たいりょくは" + super.getVitality() + "になった");
		System.out.println("");
	}
}
