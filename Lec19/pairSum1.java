package Lec19;

import java.util.ArrayList;

public class pairSum1 {

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
        int left = 0, right = list.size() - 1;

        while (left != right) {
            int currSum = list.get(left) + list.get(right);
            if (currSum == targetSum) {
                System.out.println("Idx " + left + ": " + list.get(left) + " + Idx: " + right + ": " + list.get(right) + " = Target Sum: " + targetSum);
                return;
            }

            if (currSum > targetSum) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println("Target sum not achieved!");
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(19);

        int targetSum = 16;

        findPairSum(list, targetSum);
    }
}
