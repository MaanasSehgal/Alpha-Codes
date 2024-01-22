package AllQuestionsPractice;

public class diagonalSum {

    public static int bruteForce(int matrix[][], int m, int n) {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == m - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
        // TC: O(n^2)
    }

    public static int optimized(int matrix[][], int m, int n) {
        int i = 0;
        int sum = 0;

        while (i < n) {
            sum += matrix[i][i] + matrix[i][n - 1 - i];
            i++;
        }
        if (n % 2 != 0) {
            sum -= matrix[m / 2][n / 2];
        }
        return sum;
        // TC: O(n)
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int m = matrix.length;
        int n = matrix[0].length;

        System.out.println(optimized(matrix, m, n));
    }
}
