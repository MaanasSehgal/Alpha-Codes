

public class searchInSorted2dMatrix {

    public static void foundKey(int i, int j) {
        System.out.println("Found key element at (" + i + ", " + j + ")");
    }

    //BRUTE FORCE APPROACH, TC: O(m * n)
    public static void bruteForce(int matrix[][], int m, int n, int key) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == key) {
                    foundKey(i, j);
                }
            }
        }
    }

    //ROW WISE BINARY SEARCH APPROACH, O(n log)

    //binary search

    public static int binarySearch(int arr[], int n, int key) {
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void rowWiseBinarySearch(int matrix[][], int m, int n, int key) {
        for (int i = 0; i < m; i++) {
            int idx = binarySearch(matrix[i], n, key);
            if (idx != -1) {
                foundKey(i, idx);
            }
        }
    }

    //Staricase Search, TC: O(m + n);

    public static void stairCaseSearch(int matrix[][], int m, int n, int key) {
        int row = 0, col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == key) {
                foundKey(row, col);
                return;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found");
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int m = matrix.length;
        int n = matrix[0].length;

        int key = 2;

        stairCaseSearch(matrix, m, n, key);
    }
}
