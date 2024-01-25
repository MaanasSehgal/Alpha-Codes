package Lec9.hwlec9;

public class hw4 {

    public static void calculateLeft(int left[], int heights[]) {
        left[0] = heights[0];

        for (int i = 1; i < left.length; i++) {
            left[i] = Math.max(left[i - 1], heights[i]);
        }
    }

    public static void calculateRight(int right[], int heights[]) {
        right[right.length - 1] = heights[heights.length - 1];

        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = Math.max(heights[i], right[i + 1]);
        }
    }

    public static int calculateTrappedWater(int heights[], int width) {
        int n = heights.length;

        int left[] = new int[n];
        calculateLeft(left, heights);

        int right[] = new int[n];
        calculateRight(right, heights);

        int trappedWater = 0;

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(left[i], right[i]);
            trappedWater += (waterLevel - heights[i]) * width;
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        // int heights[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int heights[] = { 4, 2, 0, 3, 2, 5 };
        int width = 1;

        int trappedWater = calculateTrappedWater(heights, width);

        System.out.println("Trapped water: " + trappedWater);
    }
}
