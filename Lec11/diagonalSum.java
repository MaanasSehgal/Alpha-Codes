package Lec11;

import java.util.Scanner;

public class diagonalSum {

    public static int findDiagonalSum(int matrix[][], int m, int n) {
        int sum = 0;

        // BRUTE FORCE
        //     for (int i = 0; i < m; i++) {
        //         for (int j = 0; j < n; j++) {
        //             if (i == j|| i + j == m - 1) {
        //                 System.out.print("(" + i + ", " + j + "), ");
        //                 sum += matrix[i][j];
        //             }
        //         }
        //     }
        // return sum;

        //OPTIMIZED APPROACH
        for (int i = 0; i < n; i++) {
            //Primary Diagonal
            sum += matrix[i][i];
            // Secondary Diagonal
            sum += matrix[i][n - i - 1];
        }
        if (n % 2 != 0) {
            sum -= matrix[n / 2][n / 2];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = 3, n = 3;
        int matrix[][] = new int[m][n];

        System.out.println("Enter the elements of the matrix: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();

        int diagonalSum = findDiagonalSum(matrix, m, n);

        System.out.println("Diagonal Sum: " + diagonalSum);
    }
}
