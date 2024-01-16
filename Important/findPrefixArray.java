package Important;

public class findPrefixArray {

  public static void findPrefixArr(int arr[]) {
    int n = arr.length;
    int prefixArray[] = new int[n];

    prefixArray[0] = arr[0];

    for (int i = 1; i < n; i++) {
      prefixArray[i] = prefixArray[i - 1] + arr[i];
    }

    for (int i = 0; i < n; i++) {
      System.out.print(prefixArray[i] + " ");
    }
  }

  public static void main(String args[]) {
    int arr[] = { 1, -2, 6, -1, 3 };

    findPrefixArr(arr);
  }
}
