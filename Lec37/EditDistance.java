package Lec37;

public class EditDistance {

    public static int editDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int dp[][] = new int[m + 1][n + 1];

        dp[0][0] = 0;

        for (int i = 1; i < m + 1; i++) {
            dp[i][0] = i;
        }

        for (int j = 1; j < n + 1; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {// same
                    dp[i][j] = dp[i - 1][j - 1];
                } else {// diff
                    // add
                    int ansOnAdding = dp[i][j - 1] + 1;
                    int ansOnDeleting = dp[i - 1][j] + 1;
                    int ansOnReplacing = dp[i - 1][j - 1] + 1;

                    dp[i][j] = Math.min(ansOnAdding, Math.min(ansOnDeleting, ansOnReplacing));
                }
            }
        }

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "abcde";

        System.out.println(editDistance(word1, word2));
    }
}
