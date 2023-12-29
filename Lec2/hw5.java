package Lec2;

public class hw5 {

  public static void main(String[] args) {
    int x = 10, y = 5;

    int exp1 = (y * (x / y + x / y));
    /*
    5 * (10 / 5 + 10 / 5)
    5 * (2 + 2)
    5 * 4
    OUTPUT: 20
    */
    int exp2 = (y * x / y + y * x / y);
    /*
    5 * 10 / 5 + 5 * 10 / 5
    50 / 5 + 50 / 5
    10 + 10
    OUTPUT: 20
    */
    System.out.println(exp1);
    System.out.println(exp2);
  }
}
