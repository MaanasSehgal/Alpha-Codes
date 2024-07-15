package Lec37;

public class WildCardMatching {
    public static boolean isPatternMatching(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean dp[][] = new boolean[m + 1][n + 1];

        // initialization
        dp[0][0] = true;

        // pattern = ""
        for (int i = 1; i < m + 1; i++) {
            dp[i][0] = false;
        }

        // string = ""
        for (int j = 1; j < n + 1; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        // Fill table bottom up
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                // ith char = jth char || jth char = ?
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    boolean emptyCase = dp[i][j - 1];
                    boolean matchCase = dp[i - 1][j];
                    dp[i][j] = emptyCase || matchCase;
                } else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s = "baaabab", p = "*****ba*****ab";//true
        // String s = "abc", p = "**d";//false

        System.out.println(isPatternMatching(s, p));
    }
}
