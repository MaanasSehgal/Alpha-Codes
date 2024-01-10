package Lec7;

public class butterflyPattern {

  public static void main(String args[]) {
    int n = 4;

    for (int i = 1; i <= n; i++) {
      //stars
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }

      //spaces
      for (int j = 1; j <= 2 * n - 2 * i; j++) {
        System.out.print("  ");
      }

      //stars
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    for (int i = n; i >= 1; i--) {
      //stars
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }

      //spaces
      for (int j = 1; j <= 2 * n - 2 * i; j++) {
        System.out.print("  ");
      }

      //stars
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
//6 1
//4 2
//3 3
//0 4
//2 * n - 2i
//1 to 6
//1 to 4
