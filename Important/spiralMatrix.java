import java.util.Scanner;

public class spiralMatrix {

    public static void printSpiralMatrix(int matrix[][], int m, int n) {
        int startRow = 0, endRow = n - 1;
        int startCol = 0, endCol = n - 1;

        System.out.println("Spiral matrix will be: ");

        while (startRow <= endRow && startCol <= endCol) {
            //top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int matrix[][] = new int[m][n];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of matrix: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("The matrix is: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        printSpiralMatrix(matrix, m, n);
    }
}
