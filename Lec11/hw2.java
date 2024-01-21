package Lec11;

public class hw2 {

    // TC: O(n)
    public static int secondRowSum(int matrix[][], int m, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[1][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };

        int m = matrix.length;
        int n = matrix[0].length;

        int sum = secondRowSum(matrix, m, n);

        System.out.println("Second row sum is: " + sum);
    }
}
