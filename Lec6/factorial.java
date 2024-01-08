package Lec6;

import java.util.*;

public class factorial {

  public static int findFact(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number to find factorial: ");
    int n = sc.nextInt();

    int factorial = findFact(n);

    System.out.println("The factorial of " + n + " is " + factorial);
    sc.close();
  }
}
