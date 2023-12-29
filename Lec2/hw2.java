package Lec2;

public class hw2 {

  public static void main(String[] args) {
    int x = 200, y = 50, z = 100;

    if (x > y && y > z) {
      System.out.println("Hello");
    }
    //200 > 50 true, 50 > 100 false, && operator, result false, Hello isn't printed
    if (z > y && z < x) {
      System.out.println("Java");
    }
    //100 > 50 true, 100 < 200 true, && operator, result true, Java printed
    if ((y + 200) < x && (y + 150) < z) {
      System.out.println("Hello Java");
    }
    //(50 + 200) is 250, 250 < 200 is false, (50 + 150) is 200, 200 < 100 is false, && operator, result false, Hello Java not printed
  }
}
//Final output: Java
