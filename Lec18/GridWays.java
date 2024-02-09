public class GridWays {

    static int ways = 0;

    public static int gridWays(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        } else if (i == m || j == n) {
            return 0;
        }

        //left
        int w1 = gridWays(i + 1, j, m, n);
        //right
        int w2 = gridWays(i, j + 1, m, n);
        
        return w1 + w2;
    }

    public static void main(String[] args) {
        System.out.println(gridWays(0, 0, 3, 3));
    }
}
