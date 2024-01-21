package Lec11;

public class hw3 {

    public static void printMatrix(int matrix[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void findTranspose(int matrix[][], int m, int n) {
        int transpose[][] = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose, n, m);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        int m = matrix.length;
        int n = matrix[0].length;

        System.out.println("Before transpose: ");
        printMatrix(matrix, m, n);

        System.out.println("After transpose: ");
        findTranspose(matrix, m, n);
    }
}
