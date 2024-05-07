package Lec31.hwlec31;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        // int arr[] = { 2, 7, 11, 15 };
        // int target = 9;

        int arr[] = { 3, 2, 4 };
        int target = 6;

        // map<number, idx>
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            // arr[i] + arr[j] = target, arr[j] = target - arr[i]
            int complement = target - arr[i];

            if (map.containsKey(complement) && i != map.get(complement)) {
                ans[0] = i;
                ans[1] = map.get(complement);

                // sort
                if (ans[0] > ans[1]) {
                    int temp = ans[0];
                    ans[0] = ans[1];
                    ans[1] = temp;
                }
                break;
            } else {
                map.put(arr[i], i);
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
