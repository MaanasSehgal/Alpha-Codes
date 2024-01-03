package Lec4;

import java.util.*;

public class hw3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int fact = 1;

    System.out.println("Enter a number to find factorial: ");
    int n = sc.nextInt();

    while (n != 1) {
      fact *= n;
      n--;
    }

    System.out.println("The factorial is: " + fact);
    sc.close();
  }
}
