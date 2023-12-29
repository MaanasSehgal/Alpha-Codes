package Lec2;

public class logicalOperators {

  public static void main(String args[]) {
    int a = 5, b = 0;
    System.out.println("(3 > 2) && (5 < 0) returns " + ((3 > 2) && (a < b)));
    // System.out.println("(3 > 2) || (5 < 0) returns " + ((3 > 2) || (a < b)));
    System.out.println("!(0 < 5) returns " + !(0 < 5));
  }
}
