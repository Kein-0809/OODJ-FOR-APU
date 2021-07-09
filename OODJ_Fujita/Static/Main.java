package OODJ_Fujita.Static;

public class Main
{
    public static void main(String[] args)
    {
        Stack tower = new Stack();
        System.out.println(Stack.stackCount + "個目のスタックです");
        Stack tower10 = new Stack(10);
        System.out.println(Stack.stackCount + "個目のスタックです");
        System.out.println("Stackを使用したメソッドを使った表示＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
        System.out.println(Stack.stackVolume() + "個目のスタックです");
        System.out.println(Stack.stackVolume() + "個目のスタックです");


    }
}

// これまで設定してきたフィールドやメソッドは，インスタンスそれぞれに設定されるように定義してきたので，インスタンス化した時に，生成されるインスタンスごとに独立して設けられる．
// 一方で，クラスで共有する変数を定義することができる. それが静的フィールドである．例として，作成するスタックのインスタンス数を記憶しておくための変数を定義する．
// 変数を定義するだけでは何も活用されないので，スタックを生成するとき，すなわち，コンストラクタが呼ばれるときに，カウントアップするように設定する．
