package Lec6;

public class decimalToBinary {

  public static int convertToBinary(int decimalNum) {
    int binaryNumber = 0, pow = 0;

    while (decimalNum != 0) {
      int remainder = decimalNum % 2;
      binaryNumber += (remainder * (int) Math.pow(10, pow));

      pow++;
      decimalNum /= 2;
    }
    return binaryNumber;
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 30; i++) {
      System.out.print(convertToBinary(i) + " ");
    }
  }
}
