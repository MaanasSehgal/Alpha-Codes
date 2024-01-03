package Lec4;

import java.util.*;

public class printNum2 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int counter = 0;

    System.out.print("Enter n: ");
    int n = sc.nextInt();

    while (counter <= n) {
      System.out.print(counter + " ");
      counter++;
    }
    System.out.print("\nSuccessfully printed numbers upto " + n);
    sc.close();
  }
}
