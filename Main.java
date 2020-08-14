import java.io.InputStream;
import java.net.URL;

public class Main {
  public static void main(String[] args) throws Exception {
    URL u = new URL("https://book.impress.co.jp/");
    // インターネットへの接続
    InputStream is = u.openStream();
    int i = is.read();
    // ページの終わりまで繰り返す
    while (i != -1) {
      char c = (char)i;
      // 読んだ内容を画面に表示
      System.out.print(c);
      i = is.read();
    }
  }
}