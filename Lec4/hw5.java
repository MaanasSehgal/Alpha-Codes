package Lec4;

public class hw5 {

  public static void main(String[] args) {
    for (int i = 0; i <= 5; i++) {
      System.out.println("i = " + i);
    }
    // System.out.println("i after the loop = " + i);
    // The error with the code is that, after we exit the for loop, the value of the variable i is not accessible due to block scope
  }
}
