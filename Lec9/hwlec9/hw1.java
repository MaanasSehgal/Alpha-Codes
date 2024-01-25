package Lec9.hwlec9;

import java.util.Arrays;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
public class hw1 {

    //Approach 1
    public static boolean checkDuplicate(int nums[]) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    //Approach 2
    public static boolean checkDuplicate2(int nums[]) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 1 };
        System.out.println(checkDuplicate2(nums));
    }
}
