package Lec1;

import java.util.*;

public class product {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a: ");
    int a = sc.nextInt();

    System.out.print("Enter b: ");
    int b = sc.nextInt();

    int product = a * b;

    System.out.println("The product is " + product);
    sc.close();
  }
}
