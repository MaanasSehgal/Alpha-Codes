package Lec4;

public class reverseNumber {

  public static void main(String args[]) {
    int n = 12345, nCopy = n, newNum = 0, lastDigit;

    while (nCopy != 0) {
      lastDigit = nCopy % 10;
      newNum = newNum * 10 + lastDigit;
      nCopy /= 10;
    }

    System.out.println("The reverse of " + n + " is: " + newNum);
  }
}
