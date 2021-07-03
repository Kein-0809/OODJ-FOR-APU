package JavaBasic;
// 「Student」というクラスを作成
class StudentForPractice {
  String name; // String型にフィールド名「name」を宣言

  // 「calculateAvg」というメソッドを作成
  public double calculateAvg(double[] data) { // 引数にdouble型の配列を渡す
    double sum = 0;
    for(int i=0; i<data.length; i++) {
      sum += data[i];
    }
    double avg = sum/data.length;
    return avg;
  }

  // 「judge」というメソッドを作成
  public String judge(double avg) {
    String result;
    if(avg >= 60) {
      result = "passed";
    } else {
      result = "failed";
    }
    return result;
  }
}

// 処理を行うためのメインの場所
public class Practice {
  public static void main(String[] args) {
    StudentForPractice a001 = new StudentForPractice();
    a001.name="sato";
    double[] data = {70, 65, 50, 90, 30};

    double avg = a001.calculateAvg(data);
    String result = a001.judge(avg);

    System.out.println(avg);
    System.out.println(a001.name + " " + result);
  }
}
