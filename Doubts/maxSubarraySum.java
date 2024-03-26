
public class maxSubarraySum {

    public static void main(String[] args) {
        int arr[] = { 3, 5, -2, 3, -7, -1, 2, 12, 1, -2 };
        // int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }

                maxSum = Math.max(currSum, maxSum);
            }
        }

        System.out.print("The max sum is: " + maxSum);
    }
}
