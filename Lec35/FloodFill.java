package Lec35;

import java.util.*;

public class FloodFill {

    public static void helper(int image[][], int sr, int sc, int color, int originalColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != originalColor) {
            return;
        }
        image[sr][sc] = color;
        helper(image, sr - 1, sc, color, originalColor);// top
        helper(image, sr, sc + 1, color, originalColor);// right
        helper(image, sr + 1, sc, color, originalColor);// bottom
        helper(image, sr, sc - 1, color, originalColor);// left

    }

    public static int[][] floodFill(int image[][], int sr, int sc, int color) {
        if (image[sr][sc] != color) {
            helper(image, sr, sc, color, image[sr][sc]);
        }
        return image;

    }

    public static void main(String[] args) {
        int image[][] = {
                { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 },
        };
        int sr = 1, sc = 1, color = 2;
        floodFill(image, sr, sc, color);

        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
    }
}
