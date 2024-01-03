package Lec4;

import java.util.*;

public class hw2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0;

    System.out.println("Enter numbers, press 999 to quit: ");

    while (true) {
      int n = sc.nextInt();

      if (n == 999) {
        break;
      }
      sum += n;
    }

    System.out.println("Sum of numbers: " + sum);
    sc.close();
  }
}
