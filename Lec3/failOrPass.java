package Lec3;

import java.util.*;

public class failOrPass {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your marks: ");
    int marks = sc.nextInt();

    String report = marks >= 33 ? "Pass" : "Fail";
    System.out.println("The student is: " + report);

    sc.close();
  }
}
