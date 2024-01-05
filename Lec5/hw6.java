public class hw6 {

  public static void main(String args[]) {
    int n = 4;

    //upper half
    for (int i = 1; i <= n; i++) {
      //stars on left
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }

      //spaces
      for (int j = (2 * n) - (2 * i); j > 0; j--) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) { //stars on the right
        System.out.print("* ");
      }
      System.out.println();
    }

    // lower half
    for (int i = n - 1; i >= 1; i--) {
      //stars on left
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }

      //spaces
      for (int j = (2 * n) - (2 * i); j > 0; j--) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) { //stars on the right
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}
