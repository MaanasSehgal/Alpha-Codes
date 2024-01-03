package Lec4;

import java.util.*;

public class sumOfNaturalNums {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter n: ");
    int n = sc.nextInt();

    int i = 1, sum = 0;

    while (i <= n) {
      sum += i;
      i++;
    }

    System.out.println("The sum is: " + sum);
    sc.close();
  }
}
