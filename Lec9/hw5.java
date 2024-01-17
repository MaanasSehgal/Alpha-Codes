package Lec9;

import java.util.Arrays;

public class hw5 {

    public static void findUniqueArrays(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (Arrays.equals(array[i], array[j])) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                // Print or do something with the unique array
                System.out.println(Arrays.toString(array[i]));
            }
        }
    }

    public static void findTriplets(int arr[]) {
        int n = arr.length;
        int rows = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || j == k || i == k) {
                        continue;
                    } else if (arr[i] + arr[j] + arr[k] == 0) {
                        // System.out.print(
                        //     "(" + arr[i] + ", " + arr[j] + ", " + arr[k] + "), "
                        // );

                        //count number of rows
                        rows++;
                    }
                }
            }
        }

        int cols = 3, idx = 0;
        int tripletArray[][] = new int[rows][cols];

        //store elements in the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || j == k || i == k) {
                        continue;
                    } else if (arr[i] + arr[j] + arr[k] == 0 && idx < rows) {
                        //store here
                        tripletArray[idx][0] = arr[i];
                        tripletArray[idx][1] = arr[j];
                        tripletArray[idx][2] = arr[k];

                        idx++;
                    }
                }
            }
        }

        //sort individual array

        for (int i = 0; i < rows; i++) {
            Arrays.sort(tripletArray[i]);
        }

        findUniqueArrays(tripletArray);
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        findTriplets(arr);
    }
}
