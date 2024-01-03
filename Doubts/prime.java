import java.util.*;

public class prime {

  public static boolean checkPrime(int num) {
    if (num <= 1) {
      return false;
    } else if (num % 2 == 0) {
      return false;
    }
    for (int i = 3; i <= Math.sqrt(num); i += 2) {
      if (num % i == 0) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    if (checkPrime(num)) {
      System.out.println("The number is prime");
    } else {
      System.out.println("The number is composite");
    }
    sc.close();
  }
}
