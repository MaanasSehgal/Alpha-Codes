

public class trappingRainwater {

    public static void calculateLeft(int left[], int heights[], int n) {
        left[0] = heights[0];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(heights[i], left[i - 1]);
        }
    }

    public static void calculateRight(int right[], int heights[], int n) {
        right[n - 1] = heights[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(heights[i], right[i + 1]);
        }
    }

    public static int trappedRainwater(int heights[], int n) {
        int left[] = new int[n];
        int right[] = new int[n];

        calculateLeft(left, heights, n);
        calculateRight(right, heights, n);

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(left[i], right[i]);
            trappedWater += waterLevel - heights[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int heights[] = { 4, 2, 0, 6, 3, 2, 5 };
        int n = heights.length;

        System.out.println("Rainwater trapped: " + trappedRainwater(heights, n));
    }
}
