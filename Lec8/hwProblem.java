//find the sum of all the sub arrays of a particular array and find out the maximum and minimum out of them

public class hwProblem {

  public static void findSubArrSum(int arr[]) {
    int n = arr.length, sum = 0, max = Integer.MIN_VALUE, min =
      Integer.MAX_VALUE;

    //start index of subarray
    for (int i = 0; i < n; i++) {
      //end index of subarray
      for (int j = i; j < n; j++) {
        sum = 0;
        //iterating over the particular subarray
        for (int k = i; k <= j; k++) {
          sum += arr[k];
        }
        //check for max
        if (max < sum) {
          max = sum;
        }

        //check for min
        if (min > sum) {
          min = sum;
        }
      }
    }

    System.out.println("Maximum sum of subarray is: " + max);
    System.out.println("Minimum sum of subarray is: " + min);
  }

  public static void main(String args[]) {
    int arr[] = { 2, 4, 6, 8, 10 };

    findSubArrSum(arr);
  }
}
