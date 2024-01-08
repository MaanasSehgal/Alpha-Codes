package Lec6;

public class swap {

  public static void swapNums(int a, int b) {
    // swapping logic
    int temp = a;
    a = b;
    b = temp;

    System.out.println("After Swap -> a: " + a + " b: " + b);
  }

  public static void main(String args[]) {
    int a = 5;
    int b = 10;
    System.out.println("Before Swap -> a: " + a + " b: " + b);

    swapNums(a, b);
  }
}
