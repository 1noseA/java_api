import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // ファイルを開く
    FileWriter fw = new FileWriter("data.txt");
    // 一文字ずつ書く
    fw.write('そ');
    fw.write('れ');
    fw.write('で');
    fw.write('は');
    // ファイルを閉じる
    fw.close();
  }
}