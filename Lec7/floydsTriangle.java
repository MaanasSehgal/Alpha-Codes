package Lec7;

public class floydsTriangle {

  public static void main(String args[]) {
    int n = 4, printElement = 1;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(printElement + " ");
        printElement++;
      }
      System.out.println();
    }
  }
}
