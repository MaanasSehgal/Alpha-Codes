package Lec37;

import java.util.Arrays;

public class LongestCommonSubsequence {

    public static int lcs(String str1, int m, String str2, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {// same last char
            return 1 + lcs(str1, m - 1, str2, n - 1);
        } else {
            return Math.max(lcs(str1, m - 1, str2, n), lcs(str1, m, str2, n - 1));
        }
    }

    public static int lcsMemo(String str1, int m, String str2, int n, int dp[][]) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {// same last char
            return dp[m][n] = 1 + lcs(str1, m - 1, str2, n - 1);
        } else {
            return dp[m][n] = Math.max(lcs(str1, m - 1, str2, n), lcs(str1, m, str2, n - 1));
        }
    }

    public static int lcsTab(String str1, int m, String str2, int n) {
        int dp[][] = new int[m + 1][n + 1];

        for (int j = 0; j <= n; j++) {
            dp[0][j] = 0;
        }

        for (int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        // String str1 = "abcde";
        // String str2 = "ace";
        
        String str1 = "abcdge";
        String str2 = "abedg";

        int m = str1.length(), n = str2.length();

        System.out.println(lcs(str1, m, str2, n));

        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(lcsMemo(str1, m, str2, n, dp));

        System.out.println(lcsTab(str1, m, str2, n));
    }
}
