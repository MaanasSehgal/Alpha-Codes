package Lec3;

import java.util.*;

public class oddEven {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of n: ");
    int n = sc.nextInt();

    if (n % 2 == 0) {
      System.out.println(n + " is an even number");
    } else {
      System.out.println(n + " is an odd number");
    }
    
    sc.close();
  }
}
