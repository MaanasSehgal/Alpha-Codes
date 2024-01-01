package Lec3;

public class hw4 {

  public static void main(String[] args) {
    int a = 63, b = 36;
    boolean x = (a < b) ? true : false;
    //63 < 36 is false, x = false
    int y = (a > b) ? a : b;
    //63 > 36 is true, y = a, y = 63

    //x = false, y = 63

    System.out.println("x: " + x);
    System.out.println("y: " + y);
  }
}
