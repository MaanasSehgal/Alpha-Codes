public class uniquePattern {

  public static void main(String[] args) {
    int n = 5;
    String space = "    ";

    for (int i = 1; i <= n; i++) {
      //spaces
      for (int j = n; j > i; j--) {
        System.out.print(space);
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = n - 1; i >= 1; i--) {
      //spaces
      for (int j = n; j > i; j--) {
        System.out.print(space);
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
