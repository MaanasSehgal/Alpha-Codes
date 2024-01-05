public class charHalfPyramid {

  public static void main(String[] args) {
    int n = 4, printChar = 65;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(((char) printChar) + " ");
        printChar++;
      }
      System.out.println();
    }
  }
}
