package Lec22;

import java.util.Arrays;
import java.util.Stack;

public class MaxAreaInHistogram {

    public static void nextSmallestRight(int heights[], int nextSmallerRight[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextSmallerRight[i] = i;
            } else {
                nextSmallerRight[i] = s.peek();
            }
            s.push(i);
        }
    }

    public static void nextSmallestLeft(int heights[], int nextSmallerLeft[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && s.peek() >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextSmallerLeft[i] = i;
            } else {
                nextSmallerLeft[i] = s.peek();
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };

        int nextSmallerRight[] = new int[heights.length];
        int nextSmallerLeft[] = new int[heights.length];

        nextSmallestRight(heights, nextSmallerRight);
        nextSmallestLeft(heights, nextSmallerLeft);

        System.out.println(Arrays.toString(nextSmallerRight));
        System.out.println(Arrays.toString(nextSmallerLeft));
    }
}
