package Lec19;

import java.util.ArrayList;

public class pairSum2 {

    //brute force O(nsq)
    // public static void findPairSum(ArrayList<Integer> list, int targetSum) {
    //     for (int i = 0; i < list.size(); i++) {
    //         for (int j = i + 1; j < list.size(); j++) {
    //             if (list.get(i) + list.get(j) == targetSum) {
    //                 System.out.println("Idx " + i + ": " + list.get(i) + " + idx: " + j + ": " + list.get(j) + " = Target Sum: " + targetSum);
    //                 return;
    //             }
    //         }
    //     }
    // }

    public static void findPairSum(ArrayList<Integer> list, int targetSum) {
        int pivotIdx = findPivot(list);

        int left = pivotIdx, right = pivotIdx - 1;

        while (left != right) {
            if (left == list.size()) {
                left = 0;
            }

            if (right == -1) {
                right = list.size() - 1;
            }
            int currSum = list.get(left) + list.get(right);

            if (currSum == targetSum) {
                System.out.println("Idx " + left + ": " + list.get(left) + " + Idx: " + right + ": " + list.get(right) + " = Target Sum: " + targetSum);
                return;
            }

            if (currSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Target sum not achieved!");
    }

    public static int findPivot(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int targetSum = 16;

        findPairSum(list, targetSum);
    }
}
