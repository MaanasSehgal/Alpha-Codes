public class reverseAnArray {

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void reverseArray(int arr[]) {
    int i = 0, j = arr.length - 1;

    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }

  public static void main(String args[]) {
    int arr[] = { 2, 4, 6, 8, 10 };
    System.out.print("Before reversing, array is: ");
    printArray(arr);

    reverseArray(arr);

    System.out.print("After reversing, array is: ");

    printArray(arr);
  }
}
