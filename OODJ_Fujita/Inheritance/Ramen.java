package OODJ_Fujita.Inheritance;

// "class" ⇒ "enum" に書き換える
enum Taste
{
  しょうゆ,みそ
}

public class Ramen
{
  protected int katasa;//1：固い，2:普通，3:柔い
  protected int ryou;//1-10
  protected Taste soup;

  // コンストラクタ
  Ramen()
  {
    System.out.println("ラーメンつくるよ");
  }

  // // 継承におけるコンストラクタのオーバーロード
  // Ramen(int men, int katasa, Taste taste)
  //   {
  //     System.out.println("指定のラーメンつくるよ");
  //     setMen(men);
  //     setKatasa(katasa);
  //     setSoup(taste);
  //   }

  // メソッド
  public void setMen(int ryou)
  {
    this.ryou = ryou;
    System.out.println("量：" + ryou);
  }

  public void setKatasa(int katasa)
  {
    this.katasa = katasa;
    System.out.println("固さ：" + katasa);
  }

  // // フィールドの値をprotectedではなくprivateにしたまま継承先などで値を取得したい時に使う
  // // フィールドの値をprotectedにしているなら不要
  // public Taste getSoup()
  //   {
  //     return this.soup;
  //   }

  public void setSoup(Taste taste)
  {
    this.soup = taste;
    System.out.println("スープ：" + this.soup);
  }

  public void checkRamen()
  {
    System.out.print("量：" + ryou);
    System.out.print("固さ：" + katasa);
    System.out.println("スープ：" + soup);
  }
}

// privateでは、継承したサブクラスからもアクセスできなくなってしまうことを意味している．privateが設定されたフィールドには，親子関係があっても，アクセスができないのである．
// protectedでは，「サブクラスか，同じパッケージ内のみアクセスできる」ようにするための修飾子
// GetterやSetterのようにフィールドを取得するメソッド，フィールドを設定するメソッド，これらをアクセサ（アクセッサ）と呼ぶ．
