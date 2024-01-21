package Lec11;

import java.util.Scanner;

public class searchInSortedMatrix {

    public static void searchKey(int matrix[][], int m, int n, int key) {
        int row = 0, col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println(
                    key + " found at index (" + row + ", " + col + ")"
                );
                return;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println(key + "wasn't found in given matrix");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = 4, n = 4;
        int matrix[][] = new int[m][n];

        System.out.println("Enter the elements of the matrix: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //10 20 30 40 15 25 35 45 27 29 37 48 32 33 39 50
        System.out.println("Enter the key to find: ");
        int key = sc.nextInt();

        sc.close();

        searchKey(matrix, m, n, key);
    }
}
