package Lec6;

public class primeInRange {

  public static boolean prime(int n) {
    if (n <= 1) {
      return false;
    } else if (n == 2) {
      return true;
    } else if (n % 2 == 0) {
      return false;
    } else {
      for (int i = 3; i <= Math.sqrt(n); i+=2) {
        if (n % i == 0) {
          return false;
        }
      }
    }
    return true;
  }

  public static void printPrimes(int range) {
    for (int i = 1; i <= range; i++) {
      if (prime(i)) {
        System.out.print(i + " ");
      }
    }
  }

  public static void main(String[] args) {
    int range = 100;

    printPrimes(range);
  }
}
