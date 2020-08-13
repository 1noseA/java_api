public class Main {
  public static void main(String[] args) {
    String s = "abc,def:ghi";
    String[] words = s.split("[,:]");
    for (String w : words) {
      System.out.print(w + "->");
    }

    String w = s.replaceAll("[beh]", "X");
    System.out.println(w);
  }

  // public boolean isValidPlayerName(String name) {
  //   return name.matches("[A-Z][A-Z0-9]{7}");
  // }
}