public class palindrome {

  public static boolean checkPalindrome(int n) {
    int lastDigit = 0, temp = n, newNum = 0;

    while (temp != 0) {
      lastDigit = temp % 10;
      newNum = newNum * 10 + lastDigit;
      temp /= 10;
    }
    if (newNum == n) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    if (checkPalindrome(110)) {
      System.out.println("The number is palindrome");
    } else {
      System.out.println("The number is not palindrome");
    }
  }
}
