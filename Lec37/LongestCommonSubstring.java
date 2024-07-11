package Lec37;

public class LongestCommonSubstring {

    public static int lcs(String str1, int m, String str2, int n) {
        int dp[][] = new int[m + 1][n + 1];
        int max = 0;

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 0;
                }
                max = Math.max(max, dp[i][j]);
            }
        }

        return max;
    }

    public static void main(String[] args) {

        String str1 = "abcde";
        String str2 = "abgce";

        // String str1 = "abcdgh";
        // String str2 = "acdghr";

        int m = str1.length(), n = str2.length();
        System.out.println(lcs(str1, m, str2, n));
    }
}
