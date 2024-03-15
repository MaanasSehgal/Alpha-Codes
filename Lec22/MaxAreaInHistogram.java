package Lec22;

import java.util.Arrays;
import java.util.Stack;

public class MaxAreaInHistogram {

    public static void nextSmallerRight(int arr[], int nsr[]) {
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
    }

    public static void nextSmallerLeft(int arr[], int nsl[]) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
    }

    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //next smallest right
        nextSmallerRight(arr, nsr);
        System.out.println(Arrays.toString(nsr));

        //next smaller left
        nextSmallerLeft(arr, nsl);
        System.out.println(Arrays.toString(nsr));

        //current area: width = j - i - 1 = nsr[i] - nsl[i] - 1
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Max area in histogram: " + maxArea);
    }

    public static void main(String[] args) {
        // int arr[] = { 2, 1, 5, 6, 2, 3 };
        int arr[] = { 2, 4 };
        maxArea(arr);
    }
}
