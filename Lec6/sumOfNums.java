package Lec6;

import java.util.*;

public class sumOfNums {

  public static int calculateSum(int num1, int num2, int num3) {
    return num1 + num2 + num3;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 3 numbers: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

    int sum = calculateSum(num1, num2, num3);

    System.out.println("The sum is: " + sum);
  }
}
