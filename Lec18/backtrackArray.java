import java.util.Arrays;

public class backtrackArray {

    public static void changeArr(int arr[], int i, int val) {
        //base case
        if (i == arr.length) {
            return;
        }

        //recursion

        //upr wale lvls
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        //call wapas ane wale steps
        arr[i] = arr[i] - 2;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}