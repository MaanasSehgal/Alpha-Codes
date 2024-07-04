package Lec37;

public class TargetSumSubset {

    public static boolean targetSumSubset(int nums[], int sum) {
        int n = nums.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];
        // i = items & j = target sum
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int v = nums[i - 1];
                // include
                if (v <= j && dp[i - 1][j - v] == true) {
                    dp[i][j] = true;
                } else if (dp[i - 1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int nums[] = { 4, 2, 7, 1, 3 };
        int targetSum = 10;

        System.out.println(targetSumSubset(nums, targetSum));
    }
}
