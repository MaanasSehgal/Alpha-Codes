
public class trappedWaterAgain {

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

    public static int findTrappedWater(int heights[], int width) {
        int n = heights.length;

        int left[] = new int[n];
        int right[] = new int[n];

        calculateLeft(left, heights, n);
        calculateRight(right, heights, n);

        int trappedWater = 0;

        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(left[i], right[i]);
            trappedWater += (waterlevel - heights[i]) * width;
        }

        return trappedWater;
    }

    public static void main(String args[]) {
        // int heights[] = { 3, 6, 2, 0, 1, 4, 0, 0, 7, 2, 1 };
        int heights[] = { 4, 2, 0, 6, 3, 2, 5 };
        // int heights[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        int width = 1;

        int trappedWater = findTrappedWater(heights, width);
        System.out.println("The trapped water stored is: " + trappedWater);
    }
}
