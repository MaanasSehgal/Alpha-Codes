import java.util.*;

public class oddEvenSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter numbers, press 999 to quit: ");

    int oddSum = 0, evenSum = 0;

    while (true) {
      int n = sc.nextInt();
      if (n == 999) {
        break;
      } else if (n % 2 == 0) {
        evenSum += n;
      } else {
        oddSum += n;
      }
    }

    System.out.println("Odd Sum: " + oddSum + " and Even Sum: " + evenSum);
    sc.close();
  }
}
