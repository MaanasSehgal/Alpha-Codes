public class printSubArrays {

  public static void printSubarrays(int arr[]) {
    int totalSubarrays = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        System.out.print("(");
        for (int k = i; k <= j; k++) {
          System.out.print(" " + arr[k] + " ");
        }
        totalSubarrays++;
        System.out.print("), ");
      }
    }
    System.out.println();
    System.out.println("Pairs: " + totalSubarrays);
  }

  public static void main(String args[]) {
    int arr[] = { 2, 4, 6, 8, 10 };

    printSubarrays(arr);
  }
}
