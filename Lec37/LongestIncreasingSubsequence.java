package Lec37;

import java.util.*;

public class LongestIncreasingSubsequence {
    public static int lcs(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;

        int dp[][] = new int[m + 1][n + 1];

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static int lis(int arr1[]) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        int arr2[] = new int[set.size()];

        int idx = 0;
        for (int num : set) {
            arr2[idx++] = num;
        }

        Arrays.sort(arr2);
        return lcs(arr1, arr2);
    }

    public static void main(String[] args) {
        int arr1[] = { 50, 3, 10, 7, 40, 80 };
        System.out.println(lis(arr1));
    }
}
