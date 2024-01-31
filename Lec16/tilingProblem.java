package Lec16;

//Given a 2 x n floor and tiles of size 2 x 1. Count the number of ways to tiles the given board using the 2 x 1 tiles.(A tile can either be placed horizontally or vertically)

public class tilingProblem {

    public static int tiling(int n) { //2 x n (floor size)
        if (n == 0 || n == 1) {
            return 1;
        }
        //vertical
        int verticalChoices = tiling(n - 1);
        //horizontal
        int horizontalChoices = tiling(n - 2);

        int totalWays = verticalChoices + horizontalChoices;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tiling(3));
    }
}
