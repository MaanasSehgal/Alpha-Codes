package Practice;

public class trappedWater {

    public static void calculateLeftMax(int left[], int heights[]) {
        left[0] = heights[0];

        for (int i = 1; i < left.length; i++) {
            left[i] = Math.max(left[i - 1], heights[i]);
        }
    }

    public static void calculateRightMax(int right[], int heights[]) {
        right[right.length - 1] = heights[heights.length - 1];

        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], heights[i]);
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findTrappedWater(int heights[], int width) {
        int n = heights.length;

        int left[] = new int[n];
        int right[] = new int[n];

        //calculating left and right max for each height
        calculateLeftMax(left, heights);
        calculateRightMax(right, heights);

        System.out.print("Left: ");
        printArray(left);
        
        System.out.print("Right: ");
        printArray(right);

        //water level
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(left[i], right[i]);
            trappedWater += (waterLevel - heights[i]) * width;
        }
        return trappedWater;
    }

    public static void main(String args[]) {
        int heights[] = { 4, 2, 0, 6, 3, 2, 5 };
        int width = 2;

        System.out.println(
            "The trapped water is: " + findTrappedWater(heights, width)
        );
    }
}
