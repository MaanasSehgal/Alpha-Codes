package Lec1;

import java.util.*;

public class hw3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the cost of 3 items: ");

    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c = sc.nextFloat();

    float sum = a + b + c;
    float totalCost = sum + (18 * sum) / 100;

    System.out.println("The sum of items is: " + sum);
    System.out.println(
      "After applying GST (18%), the total cost is: " + totalCost
    );
    sc.close();
  }
}
