public class smallestInArray {

  public static int findSmallest(int arr[]) {
    int smallest = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (smallest > arr[i]) {
        smallest = arr[i];
      }
    }
    return smallest;
  }

  public static void main(String[] args) {
    int arr[] = { 3, 6, 2, 1, 5, 3, 1 };

    int smallest = findSmallest(arr);

    System.out.println("The smallest element is: " + smallest);
  }
}
