public class Main {
  public static void main(String[] args) {
    // StringBuilderを用いた連結（+演算子より早い）
    // +演算子はそのたびにnewするためJVMに大きな負担がかかり遅い
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 10; i++) {
      sb.append("Java");
    }
    String s = sb.toString();
    System.out.println(s);
  }
}