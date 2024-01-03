package Lec4;

public class printReverseOfNum {

  public static void main(String args[]) {
    int n = 10879;

    while (n != 0) {
      System.out.print(n % 10);
      n /= 10;
    }
  }
}
