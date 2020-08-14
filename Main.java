import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // ファイルを開く
    FileReader fr = new FileReader("data.txt");
    int input = fr.read();
    // ファイルの最後まで一文字ずつ読む
    while (input != -1) {
      System.out.println((char)input);
      input = fr.read();
    }
    // ファイルを閉じる
    fr.close();
  }
}