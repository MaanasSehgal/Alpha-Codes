public class hw11 {

  public static void main(String[] args) {
    int n = 5, printEl = 1;

    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = n; j > i; j--) {
        System.out.print("  ");
      }

      printEl = i + 1;

      //numbers
      for (int j = 1; j <= 2 * i - 1; j++) {
        //logic for when to add and when to subtract
        printEl = j > i ? printEl + 1 : printEl - 1;
        System.out.print(printEl + " ");
      }
      System.out.println();
    }
  }
}
