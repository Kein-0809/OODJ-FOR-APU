package OODJ_Fujita.Composition;

public class Main {
  public static void main(String args[])
    {
      System.out.println("ノートPCを使うよ");
      NotePC dynobook = new NotePC();
      System.out.println("立ち上げるよ");//
      dynobook.initialize();
    }
}

// 合成(Composition)は強い集約関係を表す．部分のオブジェクトが全体のオブジェクトに依存するので，全体がなくなると，部分のオブジェクトもなくなってしまう．
// 「合成」の関係は，Javaのコードにおいては，クラスのフィールドとして宣言されることで関係づけられる
// 全体のクラスがなくなると，部分のクラスも存在しないつながりを持つ．「合成」は「集約」クラスのサブクラスとなる.
// すなわち，部分の一部を構成することを示す「集約」クラスの中の一部として，より結びつきの強いサブクラスとして「合成」クラスを成している．




