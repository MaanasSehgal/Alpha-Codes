package Lec6;

public class hw5 {

  public static int sumOfDigits(int num) {
    int lastDigit = 0, sum = 0;
    while (num != 0) {
      lastDigit = num % 10;
      sum += lastDigit;
      num /= 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sumOfDigits(234));
  }
}
