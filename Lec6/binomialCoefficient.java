package Lec6;

import java.util.*;

public class binomialCoefficient {

  public static int fact(int n) {
    int factorial = 1;

    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }
    return factorial;
  }

  public static int findBinomialCoefficient(int n, int r) {
    return (fact(n) / (fact(r) * fact(n - r)));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter n: ");
    int n = sc.nextInt();

    System.out.println("Enter r: ");
    int r = sc.nextInt();

    int binomialCoefficient = findBinomialCoefficient(n, r);

    System.out.println("The binomial coefficient is: " + binomialCoefficient);
    sc.close();
  }
}
