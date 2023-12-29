package Lec2;

public class hw1 {

  public static void main(String[] args) {
    int x = 2, y = 5;

    int exp1 = (x * y / x);
    int exp2 = (x * (y / x));

    System.out.print(exp1 + " , ");
    System.out.print(exp2);
  }
}
/*
 exp1 = (2 * 5 / 2);
 left to right
 10 / 2 = 5

 exp2 = (2 * (5 / 2));
 2 * (2) = 4

 OUTPUT: 5 , 4


 */
