package Lec1;

import java.util.*;

public class hw2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the side of square: ");
    int side = sc.nextInt();
    
    int area = side * side;
    
    System.out.println("The area is: " + area);
    sc.close();
  }
}
