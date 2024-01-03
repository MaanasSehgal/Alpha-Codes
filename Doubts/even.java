import java.util.*;

public class even {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int n = sc.nextInt();

    System.out.println(n % 2 == 0 ? "The number is even" : "The number is odd");
    sc.close();
  }
}
