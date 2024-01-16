package Lec9;

public class maxSubarray {

  public static int maxSubarraySum(int arr[]) {
    int n = arr.length;
    int maxSum = arr[0], currSum = 0;

    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        for (int k = i; k <= j; k++) {
          currSum += arr[k];
        }
        if (currSum > maxSum) {
          maxSum = currSum;
        }
        currSum = 0;
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10 };

    int maxSum = maxSubarraySum(arr);

    System.out.println("The maximum sum of subarray is: " + maxSum);
  }
}
