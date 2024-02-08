public class ratMaze {

    public static void findAllPaths(int i, int j, int n, int[][] matrix, boolean visited[][], String path) {
        if (i < 0 || j < 0 || i >= n || j >= n) {
            return;
        }

        if (matrix[i][j] == 0 || visited[i][j] == true) {
            return;
        }

        // If destination is reached
        if (i == n - 1 && j == n - 1) {
            System.out.println("Reached destination with path: " + path);
            return;
        }

        visited[i][j] = true;

        // Explore all possible directions
        findAllPaths(i - 1, j, n, matrix, visited, path + "U");
        findAllPaths(i + 1, j, n, matrix, visited, path + "D");
        findAllPaths(i, j - 1, n, matrix, visited, path + "L");
        findAllPaths(i, j + 1, n, matrix, visited, path + "R");

        // You can visit the cell as part of some other path
        visited[i][j] = false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 1, 1 }, { 0, 1, 0, 1 }, { 1, 1, 1, 1 }, { 1, 0, 1, 1 } };
        int n = matrix.length;
        boolean visited[][] = new boolean[n][n];
        findAllPaths(0, 0, n, matrix, visited, "");
    }
}
