package Important;

import java.util.Scanner;

public class searchInSortedMatrix {

    //brute force method, TC: O(n ^ 2)
    public static void bruteForce(int matrix[][], int m, int n, int key) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == key) {
                    System.out.println(key + " found at index (" + i + ", " + j + ")");
                    return;
                }
            }
        }
        System.out.println(key + " wasn't found in given matrix");
    }

    //Staircase method, TC: O(m + n)
    public static void searchKey(int matrix[][], int m, int n, int key) {
        int row = 0, col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println(key + " found at index (" + row + ", " + col + ")");
                return;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println(key + " wasn't found in given matrix");
    }

    //BINARY SEARCH APPROACH, TC: O(n log n)

    //binary search algorithm
    public static boolean binarySearch(int arr[], int key, int i) {
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                System.out.println(key + " found at index (" + i + ", " + mid + ")");
                return true;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void binarySearchApproach(int matrix[][], int m, int n, int key) {
        for (int i = 0; i < m; i++) {
            if (binarySearch(matrix[i], key, i)) {
                return;
            }
        }
        System.out.println("Key not found");
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

        // bruteForce(matrix, m, n, key);
        // binarySearchApproach(matrix, m, n, key);
        searchKey(matrix, m, n, key);
    }
}
