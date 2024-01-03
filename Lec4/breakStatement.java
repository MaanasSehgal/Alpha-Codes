package Lec4;

import java.util.*;

public class breakStatement {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter numbers: ");

    while (true) {
      int n = sc.nextInt();
      if (n % 10 == 0) {
        break;
      } else {
        System.out.println("You entered " + n + ", enter next number");
      }
    }
    System.out.println("You entered a multiple of 10, code exited");
    sc.close();
  }
}
