package AllQuestionsPractice;

//There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.You must write an algorithm with O(log n) runtime complexity

public class rotatedIndexSearch {

    //binary search

    public static int binarySearch(int arr[], int start, int end, int key) {
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

    public static int findIndex(int arr[], int n, int key) {
        int pivotIndex = -1;

        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid - 1] > arr[mid]) {
                pivotIndex = mid;
                break;
            } else if (arr[start] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Pivot Index: " + pivotIndex);

        int keyIdx1 = binarySearch(arr, 0, pivotIndex - 1, key);
        int keyIdx2 = binarySearch(arr, pivotIndex, n - 1, key);

        if (keyIdx1 != -1) {
            return keyIdx1;
        } else if (keyIdx2 != -1) {
            return keyIdx2;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 8, 0, 1, 2 };
        int n = arr.length;
        int key = 1;

        System.out.println("Index of key " + key + " : " + findIndex(arr, n, key));
    }
}
