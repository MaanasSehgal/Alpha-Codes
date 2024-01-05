public class hw8 {

  public static void main(String[] args) {
    int n = 5;

    for (int i = 1; i <= n; i++) {
      //spaces
      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n; j++) {
        //hollow square
        if (i == 1 || i == n || j == 1 || j == n) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
