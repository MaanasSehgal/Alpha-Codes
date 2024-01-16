package Lec9;

public class optimizedMaxSubarray {

  //findprefix
  public static void findPrefixArr(int arr[], int prefix[]) {
    int n = arr.length;

    prefix[0] = arr[0];
    for (int i = 1; i < n; i++) {
      prefix[i] = prefix[i - 1] + arr[i];
    }
  }

  public static int maxSubarray(int arr[]) {
    int n = arr.length;
    int currSum = 0, maxSum = arr[0];
    int prefix[] = new int[n];
    findPrefixArr(arr, prefix);

    for (int i = 0; i < n; i++) {
      int start = i;
      for (int j = i; j < n; j++) {
        int end = j;

        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    return maxSum;
  }

  public static void main(String args[]) {
    int arr[] = { 1, -2, 6, -1, 3 };

    int maxSum = maxSubarray(arr);
    System.out.println("Maximum sum is: " + maxSum);
  }
}
