public class Main {
  public static void main(String[] args) {
    String s1 = "Java and JavaScript";
    // 15-2-2 文字列を検索する
    if (s1.contains("Java")) {
      System.out.println("文字列s1は、Javaを含んでいます");
    }
    if (s1.endsWith("Java")) {
      System.out.println("文字列s1は、Javaが末尾にあります");
    }
    System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java")); // 0
    System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java")); // 9

    // 15-2-3 文字を切り出す
    String s2 = "Java programming";
    // 先頭位置は0
    System.out.println("文字列s2の４文字目以降は" + s2.substring(3));
    // =>"a programming"
    System.out.println("文字列s2の４〜８文字目は" + s2.substring(3, 8));
    // =>"a pro"
  }
}