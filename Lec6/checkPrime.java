package Lec6;

public class checkPrime {

  public static boolean isPrime(int n) {
    if (n <= 2) {
      return true;
    } else if (n % 2 == 0) {
      return false;
    }
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPrime(4));
  }
}
