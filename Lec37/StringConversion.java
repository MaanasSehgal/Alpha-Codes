package Lec37;

public class StringConversion {

    public static int findLcs(String s1, int m, String s2, int n) {
        int dp[][] = new int[m + 1][n + 1];

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static int stringConv(String word1, String word2) {
        // lcs nikalo -> common letter count, chedna ni he
        // delete kro baki char -> word1.length() - lcs
        // ans += word1.length() - lcs
        // add kro jitne baki he, i.e. ans += (word2.length() - lcs)
        int m = word1.length();
        int n = word2.length();

        int lcs = findLcs(word1, m, word2, n);
        System.out.println("LCS: " + lcs);
        return m + n - 2 * lcs;
    }

    public static void main(String[] args) {
        String word1 = "pear";
        String word2 = "sea";

        System.out.println(stringConv(word1, word2));
    }
}
