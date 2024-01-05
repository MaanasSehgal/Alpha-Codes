public class hw10 {

  public static void main(String[] args) {
    int n = 5;

    for (int i = 1; i <= n; i++) {
      //spaces
      for (int j = n; j > i; j--) {
        System.out.print("  ");
      }
      //stars
      for (int j = 1; j <= i; j++) {
        System.out.print(i + "   ");
      }
      System.out.println();
    }
  }
}
