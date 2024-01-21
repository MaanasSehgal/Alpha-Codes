package Lec11;

public class hw1 {

    //TC: O(n^2)
    public static int countSevens(int matrix[][], int m, int n) {
        int sevenCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 7) {
                    sevenCount++;
                }
            }
        }
        return sevenCount;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int m = matrix.length;
        int n = matrix[0].length;

        int sevenCount = countSevens(matrix, m, n);

        System.out.println("Number of 7's: " + sevenCount);
    }
}
