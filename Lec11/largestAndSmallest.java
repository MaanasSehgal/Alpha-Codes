package Lec11;

import java.util.Scanner;

public class largestAndSmallest {

    public static int findSmallest(int arr[][], int m, int n) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                smallest = Math.min(arr[i][j], smallest);
            }
        }
        return smallest;
    }

    public static int findLargest(int arr[][], int m, int n) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                largest = Math.max(arr[i][j], largest);
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = 3, n = 3;
        int arr[][] = new int[m][n];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        int smallest = findSmallest(arr, m, n);
        int largest = findLargest(arr, m, n);

        System.out.println(
            "Smallest is: " + smallest + " and Largest is: " + largest
        );
    }
}
