package Lec1;

import java.util.*;

public class areaOfCircle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the radius of circle: ");
    float radius = sc.nextFloat();

    float area = 3.14f * radius * radius;

    System.out.println("The area of the circle is: " + area);
    sc.close();
  }
}
