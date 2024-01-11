public class reverseArray {

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    int n = arr.length;

    int i = 0, j = n - 1;

    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }

    for (int k = 0; k < n; k++) {
      System.out.print(arr[k] + " ");
    }
  }
}
