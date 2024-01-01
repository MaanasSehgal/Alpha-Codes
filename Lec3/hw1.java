package Lec3;

import java.util.*;

public class hw1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int n = sc.nextInt();

    if (n > 0) {
      System.out.println("The number is positive");
    } else if (n < 0) {
      System.out.println("The number is negative");
    } else {
      System.out.println("The number is 0");
    }
    sc.close();
  }
}
