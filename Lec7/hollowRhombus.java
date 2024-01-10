package Lec7;

public class hollowRhombus {

  public static void main(String args[]) {
    int n = 4;

    for (int i = 1; i <= n; i++) {
      //spaces
      for (int j = n; j >= i; j--) {
        System.out.print("  ");
      }
      //hollow rhombus logic
      for (int j = 1; j <= n; j++) {
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
