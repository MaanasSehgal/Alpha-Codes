public class hw5 {

  public static void main(String args[]) {
    int n = 5, flag = 1;

    for (int i = 1; i <= n; i++) {
      flag = i % 2 == 0 ? 0 : 1;
      for (int j = 1; j <= i; j++) {
        System.out.print(flag + " ");
        flag = flag == 1 ? 0 : 1;
      }
      System.out.println();
    }
  }
}
