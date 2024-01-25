package Lec6.hwlec6;

public class hw3 {

  public static boolean checkPalindrome(int num) {
    int numCopy = num, lastDigit = 0, newNum = 0;

    while (num != 0) {
      lastDigit = num % 10;
      newNum = newNum * 10 + lastDigit;
      num /= 10;
    }

    if (newNum == numCopy) {
      return true;
    } else {
      return false;
    }
  }
  public static void main(String[] args) {
    System.out.println(checkPalindrome(433));
  }
}
