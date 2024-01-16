package DoubtPractice;

public class trappedWaterAgain {

    public static void findLeft(int left[], int heights[]) {
        left[0] = heights[0];

        for (int i = 1; i < left.length; i++) {
            left[i] = Math.max(left[i - 1], heights[i]);
        }
    }

    public static void findRight(int right[], int heights[]) {
        right[right.length - 1] = heights[right.length - 1];

        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], heights[i]);
        }
    }

    public static int findTrappedWater(int heights[], int width) {
        int n = heights.length;

        int left[] = new int[n];
        int right[] = new int[n];

        findLeft(left, heights);
        findRight(right, heights);

        int trappedWater = 0;

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(left[i], right[i]);

            trappedWater += (waterLevel - heights[i]) * width;
        }

        return trappedWater;
    }

    public static void main(String args[]) {
        int heights[] = { 3, 6, 2, 0, 1, 4, 0, 0, 7, 2, 1 };
        int width = 1;

        int trappedWater = findTrappedWater(heights, width);
        System.out.println("The trapped water stored is: " + trappedWater);
    }
}
