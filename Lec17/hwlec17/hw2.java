package hwlec17;

import java.util.Arrays;

public class hw2 {

    //Question 2: Given an array nums of size n, return the majority element. (MEDIUM)
    // The majority element is the element that appears more than ⌊n/2⌋ times. Assume that the majority element always exists in the array.

    // Sample Input 1:
    // nums = [3, 2, 3]

    // Sample Output 1:
    // 3

    // Sample Input 2:
    // nums = [2, 2, 1, 1, 1, 2, 2]

    // Sample Output 2:
    // 2
    public static void main(String[] args) {
        // int arr[] = { 3, 2, 3 };
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        Arrays.sort(arr);
        System.out.println(arr[arr.length / 2]);
    }
}
