import java.util.*;

public class arraycc {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = 5;
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Enter element at position " + i + ": ");
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

    sc.close();
  }
}
