package Lec37;

import java.util.Arrays;

public class CatalansNumber {
    public static int findCatalansNumber(int n, int dp[]) {
        if (dp[n] != -1) {
            return dp[n];
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += findCatalansNumber(i, dp) * findCatalansNumber(n - 1 - i, dp);
        }
        dp[n] = sum;
        return dp[n];
    }

    public static int findCatalansTab(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dp[1] = 1;
        System.out.println(findCatalansNumber(n, dp));
        System.out.println(findCatalansTab(n));

    }
}
