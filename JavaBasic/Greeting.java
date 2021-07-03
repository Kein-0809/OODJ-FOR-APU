package JavaBasic;
class Greeting { //クラスを定義 (クラスを作成)
  // ファイルの名前(Greeting.java)とクラス名(Greeting)は同じにする必要がある
  // クラス名の最初は必ず大文字
  public static void main(String ages[]){ //メソッドの定義(メソッドを作成)
    // System.out.println("Good morning");
    // System.out.println("おはよう！");
    // System.out.println("Good morning");
    // System.out.println("********************************");

    // // 整数系のデータ型
    // byte var01 = 1;  // -100〜100
    // short var02 = 12345; // -3万〜+3万
    // int var03 = 1234567890; // -20億〜+20億
    // long var04 = 123456789000L; // 「京」の桁以上 (最後に必ず「L」をつける)
    // System.out.println(var01);
    // System.out.println(var02);
    // System.out.println(var03);
    // System.out.println(var04);
    // System.out.println("********************************");

    // // 小数系のデータ型
    // float var05 = 1.234F; // 小数点以下の桁数 (最後に必ず「F」をつける)
    // double var06 = 1.23456789; //「float」よりも多くの小数点以下の桁数を配置できる (大体小数点を扱う時はこっちを使う)
    // System.out.println(var05);
    // System.out.println(var06);
    // System.out.println("********************************");

    // // 文字列型
    // char var07 = 'c'; // 1文字を扱う時に使う (シングルクォーテーション)
    // String var08 = "Hello,World"; // 2文字以上を扱う時に使う (ダブルクォーテーション)
    // System.out.println(var07);
    // System.out.println(var08);
    // System.out.println("********************************");

    // // Boolean型
    // int var_a = 10;
    // int var_b = 1;
    // boolean var_bool_t;
    // boolean var_bool_f;
    // var_bool_t = (var_a > var_b); // True
    // var_bool_f = (var_a < var_b); // False
    // System.out.println(var_bool_t);
    // System.out.println(var_bool_f);
    // System.out.println("********************************");

    // // Array(配列)
    // // 配列の作り方1
    
    // // データ型[] 配列変数名;
    // // 配列変数名 = new データ型[要素数];
    // String[] arr;
    // arr = new String[3];

    // arr[0]="sato";
    // arr[1]="suzuki";
    // arr[2]="takahashi";

    // System.out.println(arr[0]);
    // System.out.println(arr[1]);
    // System.out.println(arr[2]);

    // arr[1] = "Ishii"; // 配列の中身を変える "suzuki" → "Ishii"
    // System.out.println(arr[1]);

    // // 配列の作り方2

    // // データ型[] 配列変数 = {データ1,データ2, .........};
    // String[] arr2 = {"TAKEDA","TANAKA","SAITO"};

    // System.out.println(arr2[0]);
    // System.out.println(arr2[1]);
    // System.out.println(arr2[2]);
    // System.out.println("********************************");

    // 二次元配列
    String [][] arr3;
    arr3 = new String[2][3]; // row(横列) column(縦列)
    // String [][] arr3 = {{"A","B"},{"C","D"},{"E","F"}}; // ←2次元配列を1行で書く場合
    arr3[0][0] = "A";
    arr3[0][1] = "B";
    arr3[0][2] = "C";
    arr3[1][0] = "D";
    arr3[1][1] = "E";
    arr3[1][2] = "F";
    for(int i=0; i<2; i++)
    {
      for(int j=0; j<3; j++)
      {
        System.out.println(arr3[i][j]);
      }
    }
    System.out.println("********************************");

    // 条件分岐 continue
    for(int i=0; i<=4; i++)
    {
      if(i==3)
      {
        continue; // iが3ならcontinueのところで次の処理にスキップする
      }
      System.out.println(i);
    }

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
    
  }
}