package Lec6;
import java.util.*;

public class product {

  public static int findProduct(int num1, int num2) {
    return num1 * num2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 2 numbers: ");

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int product = findProduct(num1, num2);

    System.out.println(
      "The product of " + num1 + " and " + num2 + " is " + product
    );
    sc.close();

  }
}
