package Lec6;

public class binaryToDecimal {

  public static int convertToDecimal(int binaryNumber) {
    int lastDigit = 0, mul = 1, decimalNumber = 0;
    while (binaryNumber != 0) {
      lastDigit = binaryNumber % 10 * mul;
      mul *= 2;
      binaryNumber /= 10;
      decimalNumber += lastDigit;
    }
    return decimalNumber;
  }

  public static void main(String[] args) {
    int n = 101;

    System.out.println(convertToDecimal(n));
  }
}
