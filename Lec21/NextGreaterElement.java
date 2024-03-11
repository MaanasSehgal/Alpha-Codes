package Lec21;

import java.util.*;

public class NextGreaterElement {

    // public static int[] findNextGreaterElement(int nums[]) {
    //     int result [] = new int[nums.length];
    //     Stack<Integer> stack = new Stack<>();

    //     for (int i = nums.length - 1; i >= 0; i--) {
    //         while (!stack.isEmpty() && stack.peek() <= nums[i]) {
    //             stack.pop();
    //         }

    //         result[i] = stack.isEmpty() ? -1 : stack.peek();
    //         stack.push(nums[i]);
    //     }

    //     return result;
    // }

    public static int[] findNextGreaterElement(int nums[]) {
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[nums.length];

        //backward iterations
        //while stack is not empty and top element is less than current element, then pop
        //if stack is empty, store -1
        //else store top element

        for (int i = nums.length - 1; i >= 0; i--){
            int currEl = nums[i];
            while(!s.isEmpty() && currEl > s.peek()) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = s.peek();
            }
            s.push(currEl);
        }

        return nextGreater;


    }
    //brute force O(N^2)
    // public static int[] findNextGreaterElement(int nums[]) {
    //     int result[] = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         result[i] = -1;
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[j] > nums[i]) {
    //                 result[i] = nums[j];
    //                 break;
    //             }
    //         }
    //     }
    //     return result;
    // }

    public static void main(String[] args) {
        // int nums[] = { 6, 8, 0, 1, 3 };
        int nums[] = { 4, 9, 7, 6, 10, 8, 2, 3, 5, 1 };
        int nextGreaterElements[] = findNextGreaterElement(nums);

        System.out.println("Next Greater Elements:");
       System.out.println(Arrays.toString(nextGreaterElements));
    }
}
