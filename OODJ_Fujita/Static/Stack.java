package OODJ_Fujita.Static;

// Default class (指定なし)
// 同一のパッケージ内のクラスからのみ利用が可能なので、パッケージが違うと利用ができなくなります。
class Stack // ← Default class
{
  private int volume;
  private int data[];
  static int defaultSize = 5;
  static int stackCount = 0;
  //標準サイズのためのコンストラクタ
  public Stack()
  {
    this(defaultSize);
  }
  //サイズ指定のためのコンストラクタ
  public Stack(int stackSize)
  {
    data = new int[stackSize];
    System.out.println(data.length + "個分のスタック生成");
    stackCount++;
  }
  //データ追加メソッド
  public boolean push(int number)
  {
    if(number > 0)
    {
      if(volume < data.length)
      {
        data[volume] = number;
        volume++;
        return true;
      }
      else
      {
        System.out.println("stack overflow");
        return false;
      }
    }
    else
    {
      System.out.println("input value invalid");
      return false;
    }
  }
  //データ取得メソッド
  public int pop()
  {
    int value;
    if(volume > 0)
    {
      value = data[volume -1];
      data[volume -1] = 0;
      volume--;
    }
    else
    {
      value = -1;
    }
    return value;
  }
  //状態表示メソッド
  public void printStack()
  {
    System.out.print("|");
    for(int i=0; i < data.length; i++)
    {
      printStack(i);
      System.out.print("|");
    }
    System.out.println("");
  }
  //個別の状態表示メソッド
  private void printStack(int i)
  {
    System.out.print(data[i]);
  }

  //生成したスタックの個数を取得するためのメソッド
  public static int stackVolume()
  {
    return stackCount;
  }
}
