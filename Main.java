public class Main {
  public static void main(String[] args) {
    String s1 = "スッキリJava";
    String s2 = "Java";
    String s3 = "java";
    // 内容が等しいか
    if (s2.equals(s3)) {
      System.out.println("s2とs3は等しい");
    }
    // 大文字小文字を区別せず内容が等しいか調べる
    if (s2.equalsIgnoreCase(s3)) {
      System.out.println("s2とs3はケースを区別しなければ等しい");
    }
    // length文字列長を調べる（全角文字も半角文字も一文字としてカウント）
    System.out.println("s1の長さは" + s1.length() + "です");
    // 空文字か（length()==0)
    if (s1.isEmpty()) {
      System.out.println("s1は空文字です");
    }
  }
}