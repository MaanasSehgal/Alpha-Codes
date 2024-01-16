package Important;

public class kadanesAlgorithm {

  public static int kadanes(int arr[]) {
    int n = arr.length;
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    boolean negativeFlag = true;

    //base case for all negative
    for (int i = 0; i < n; i++) {
      if (arr[i] >= 0) {
        negativeFlag = false;
        break;
      }
    }

    //if all negative
    if (negativeFlag) {
      for (int i = 0; i < n; i++) {
        if (maxSum < arr[i]) {
          maxSum = arr[i];
        }
      }
      return maxSum;
    } else {
      for (int i = 0; i < n; i++) {
        currSum = currSum + arr[i];
        if (currSum < 0) {
          currSum = 0;
        }
        maxSum = Math.max(currSum, maxSum);
      }
      return maxSum;
    }
  }

  public static void main(String[] args) {
    // int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
    // int arr[] = { 6, -2, 3, -7, -5, 4, 7, -8, -6, 10, -4 };
    int arr[] = { -3, -2, -6, -4, -8, -3, -1, -5 };
    System.out.println("The maximum subarray sum is: " + kadanes(arr));
  }
}
