package Lec3;

import java.util.*;

public class hw5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a year: ");
    int year = sc.nextInt();

    boolean leapyear = false;

    if (year % 4 == 0) {
      if (year % 100 != 0) {
        leapyear = true;
      } else if (year % 400 == 0) {
        leapyear = true;
      }
    }

    if (leapyear) {
      System.out.println(year + " is a leap year");
    } else {
      System.out.println(year + " is not a leap year");
    }
    sc.close();
  }
}
