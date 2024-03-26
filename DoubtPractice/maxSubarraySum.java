

public class maxSubarraySum {

    public static int bruteForce(int arr[], int n) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                //subarray
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
        // TC: O(n^3);
    }

    public static int prefixSum(int arr[], int n) {
        int prefix[] = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
        // TC: O(n^2)
    }

    public static int kadanesAlgorithm(int arr[], int n) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
        // TC: O(n)
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, -5, 2, 1, 5, 3, 9, -10, 6, 5 };
        int n = arr.length;

        System.out.println("Max sum is: " + kadanesAlgorithm(arr, n));
    }
}
