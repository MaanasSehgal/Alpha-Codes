public class largestInArray {

  public static int findLargest(int arr[]) {
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (largest < arr[i]) {
        largest = arr[i];
      }
    }
    return largest;
  }
  public static void main(String[] args) {
    int arr[] = { 3, 6, 2, 1, 5, 3, 1 };

    int largest = findLargest(arr);

    System.out.println("The largest element is: " + largest);
  }
}
