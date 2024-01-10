package Lec7;

public class solidRhombus {

  public static void main(String args[]) {
    int n = 4;

    for (int i = 1; i <= n; i++) {
      //spaces
      for (int j = n; j > i; j--) {
        System.out.print("  ");
      }
      //stars
      for (int j = 1; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
