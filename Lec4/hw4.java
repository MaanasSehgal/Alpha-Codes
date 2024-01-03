package Lec4;

import java.util.*;

public class hw4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number to find its table: ");
    int n = sc.nextInt();

    System.out.println("The table of 3: ");

    for (int i = 1; i <= 10; i++) {
      System.out.println(n + " * " + i + " = " + n * i);
    }
    sc.close();
  }
}
