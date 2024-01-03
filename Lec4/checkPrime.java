package Lec4;

import java.util.*;

public class checkPrime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number to check prime: ");
    int n = sc.nextInt();

    boolean prime = true;

    if (n == 1 || n % 2 == 0) {
      prime = false;
    } else {
      for (int i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i == 0) {
          prime = false;
          break;
        }
      }
    }

    if (prime) {
      System.out.println(n + " is a prime number");
    } else {
      System.out.println(n + " is not a prime number");
    }
    sc.close();
  }
}
