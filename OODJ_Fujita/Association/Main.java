package OODJ_Fujita.Association;

public class Main {
  public static void main(String args[])
    {
        Student fujita = new Student();
        fujita.buyBook("ライ麦畑で捕まえて");
        fujita.printTitle();
    }
}

// 関連(Association)は，オブジェクトとつながりがあるゆえに何らかの属性を持つ関係にあるが，その属性がオブジェクトを定義づける一部とはならない関係を指す．
// !「誘導可能性」は，具体的には，フィールドに現れる．フィールドに持っていると，そのフィールドに対して，誘導可能性があるということになる．
// !すなわち，フィールドに持つということは，その関連しているオブジェクトに何らかのアクセスがあるということを意味している．フィールドに持つオブジェクトが持つメソッドを実行することがあることが考えられる．
// この例では、StudentがBookを持つという関連がある．しかし，BookはStudentを定義づける一部ではない．
// すなわち，Studentの構成パーツとしてBookがあるほどの結びつきではないが，StudentがBookを持つことができるような関係を指す．
// StudentはBookを持つことから「has-a」関係といえる．（Student has-a Book）
