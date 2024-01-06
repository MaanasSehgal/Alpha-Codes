public class hourglassPattern {

  public static void main(String[] args) {
    int n = 5;

    for (int i = 1; i <= n; i++) {
      //spaces
      for (int j = 1; j < i; j++) {
        System.out.print("  ");
      }
      //stars
      for (int j = 2 * n - i; j >= i; j--) {
        System.out.print("* ");
      }
      System.out.println();
    }

    //lower half
    for (int i = n - 1; i >= 1; i--) {
      //spaces
      for (int j = 1; j < i; j++) {
        System.out.print("  ");
      }
      //stars
      for (int j = 2 * n - i; j >= i; j--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
