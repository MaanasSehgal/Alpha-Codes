package Lec4;

import java.util.*;

public class continueStatement {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("Enter your number, press 999 to quit: ");
      int n = sc.nextInt();

      if (n == 999) {
        break;
      }

      if (n % 10 == 0) {
        continue;
      }

      System.out.println("You entered " + n);
    }
    System.out.println("Exited code");
    sc.close();
  }
}
