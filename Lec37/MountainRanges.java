package Lec37;

public class MountainRanges {

    public static int findMountainPairs(int pairs) {
        int dp[] = new int[pairs + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < pairs + 1; i++) {
            for (int j = 0; j < i; j++) {
                int pairsInsideStrokes = dp[j];
                int pairsOutsideStrokes = dp[i - j - 1];
                dp[i] += pairsInsideStrokes * pairsOutsideStrokes;
            }
        }
        return dp[pairs];
    }

    public static void main(String[] args) {
        int pairs = 4;
        System.out.println(findMountainPairs(pairs));
    }
}
