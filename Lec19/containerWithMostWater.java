package Lec19;

public class containerWithMostWater {

    //brute force O(nsq)
    // public static int calculateMostWater(int heights[]) {
    //     int maxArea = Integer.MIN_VALUE;
    //     for (int i = 0; i < heights.length; i++) {
    //         for (int j = i + 1; j < heights.length; j++) {
    //             //pair is heights[i] with heights[j];
    //             int currArea = Math.min(heights[i], heights[j]) * (j - i);
    //             maxArea = Math.max(maxArea, currArea);
    //         }
    //     }
    //     return maxArea;
    // }

    public static int calculateMostWater(int heights[]) {
        int maxArea = Integer.MIN_VALUE;

        int i = 0, j = heights.length - 1;

        while (i < j) {
            int currArea = Math.min(heights[i], heights[j]) * (j - i);
            maxArea = Math.max(maxArea, currArea);

            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int heights[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        int mostWater = calculateMostWater(heights);
        System.out.println("Most amount of water: " + mostWater);
    }
}
