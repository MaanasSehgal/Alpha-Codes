public class hw3 {

  public static void main(String args[]) {
    int n = 5, k = 1;

    for (int i = 1; i <= n; i++) {
      for (int j = n; j >= i; j--) {
        System.out.print(k + " ");
        k++;
      }
      k = 1;
      System.out.println();
    }
  }
}
