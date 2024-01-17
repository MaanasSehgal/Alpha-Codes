package Lec9;

//There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexi

public class hw2 {

    public static int search(int arr[], int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int findIndexOfTarget(int arr[], int target) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int k = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] > arr[mid + 1]) {
                //found peak
                k = mid;
                break;
            } else if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (target >= arr[0] && target <= arr[k]) {
            start = 0;
            end = k;
        } else {
            start = k;
            end = n - 1;
        }

        return search(arr, start, end, target);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 0, 1, 1, 1, 2, 3, 4 };
        int target = 3;

        int index = findIndexOfTarget(arr, target);
        System.out.println("Index of target is: " + index);
    }
}
