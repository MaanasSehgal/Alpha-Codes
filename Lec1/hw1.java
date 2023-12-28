package Lec1;

import java.util.*;

public class hw1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter 3 integer values: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    float avg = (a + b + c) / 3;

    System.out.println("The average of the numbers is: " + avg);
    sc.close();
  }
}
