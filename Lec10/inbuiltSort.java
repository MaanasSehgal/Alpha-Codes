package Lec10;

import java.util.Arrays;
import java.util.Comparator;

public class inbuiltSort {

    public static void main(String[] args) {
        Integer arr[] = { 5, 3, 2, 1, 3, 4 };

        Arrays.sort(arr, Comparator.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
