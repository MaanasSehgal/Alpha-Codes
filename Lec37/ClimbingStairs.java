package Lec37;

public class ClimbingStairs {
    // Count ways to reach the nth stair. The person can climb either 1 stair or 2

    public static int ways(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        }
        return ways(n - 1) + ways(n - 2);
    }

    // o(n)
    public static int waysMem(int n, int dp[]) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        }

        if (dp[n] != 0)
            return dp[n];
        return dp[n] = ways(n - 1) + ways(n - 2);
    }

    public static int waysTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n + 1];
        System.out.println(ways(n));
        System.out.println(waysMem(n, dp));
        System.out.println(waysTab(n));
    }
}
