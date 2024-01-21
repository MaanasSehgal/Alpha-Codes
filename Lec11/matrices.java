package Lec11;

import java.util.*;

public class matrices {

    public static boolean search(int matrix[][], int key) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == key) {
                    System.out.println(
                        key + " found at cell (" + i + ", " + j + ")"
                    );

                    return true;
                }
            }
        }
        System.out.println(key + " was not found");
        return false;
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

        System.out.println("The elements of the matrix are: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 4);
    }
}
