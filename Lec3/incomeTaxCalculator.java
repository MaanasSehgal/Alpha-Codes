package Lec3;

import java.util.*;

public class incomeTaxCalculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int tax;

    System.out.println("Enter your income");
    int income = sc.nextInt();

    if (income < 500000) {
      tax = 0;
    } else if (income >= 500000 && income < 1000000) {
      tax = (int) (income * 0.2);
    } else {
      tax = (int) (income * 0.3);
    }

    System.out.println("Your tax is: " + tax);
    System.out.println(
      "Your income after reduction of tax is: " + (income - tax)
    );

    sc.close();
  }
}
