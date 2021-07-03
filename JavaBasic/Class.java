package JavaBasic;
// Method(メソッド)について
    // Methodを使うメリットは.....
      // 1. 同じものを2度書く必要性がない
      // 2. 同じものを他の場面で使える
      // 3. 他の人も使うことができる

    // Methodの構成の解説
    // ①public ②static ③void ④main⑤(String[] args) {}
    // ①publicの部分を「Access Modifier(アクセス修飾子)」という．//!これはどこからアクセスできるか決めるもの
    //! 「public」他のクラスからアクセス可能
    //! 「protected」同じパッケージ＆サブクラスからアクセス可能
    //! 「指定なし」同じパッケージからアクセス可能
    //! 「private」同じクラスからアクセス可能
    // ②staticの部分を「Non Access Modifier」
    //! 「static」クラスをインスタンス化しなくても、直接呼び出し可能
    //! 「abstract」クラスをインスタンス化できない
    //! 「final」クラスを上書きすることができない
    // ③voidの部分で「戻り値の型」を指定する
    //! 「void」戻り値がない時に記述する
    //! 「int」戻り値が数値型の時に記述する
    //! 「String」戻り値が文字列型の時に記述する
    // ④mainの部分でメソッド名を書く
    // ⑤(String[] args)の部分で引数の型を書く

    // Class(クラス)の解説
    // Classとは、「データ」と「処理」をまとめたもの
    // Javaでは、データのことを「フィールド」,処理のことを「メソッド」という
    // メソッドとフィールドのようなクラスの要素のことを「メンバー」という
    // 「フィールド」とは、クラス内で定義された変数のことで、メンバー変数ともいう

// 実際のコード例↓
// 「Student」というクラス名を定義(最初は大文字)
class Student {
  String name = "sato"; // ←フィールド． フィールド名は「name」

  // 「calculateAvg」というMethodを定義
  public void calculateAvg(int math,int english) {
    System.out.println((math + english) / 2);
  }
}

public class Class {
  public static void main(String[] args) {
    Student a001 = new Student(); // 「Student」はクラス名．「a001」はオブジェクト名．「= new」の後に「クラス名()」を書く．
    // ↑の記述が「インスタンス化」というもの
    a001.name = "sato"; // ←フィールドに値を代入
    System.out.println(a001.name);

    // メソッドの使用例↓
    a001.calculateAvg(90, 80);

    Student a002 = new Student();
    a002.name = "suzuki";
    System.out.println(a002.name);
  }
}


