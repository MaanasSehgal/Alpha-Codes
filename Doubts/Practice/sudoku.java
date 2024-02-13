public class sudoku {

    static final int n = 9;

    public static boolean solveSudoku(int sudoku[][], int row, int col) {
        //basecase
        if (row == n) {
            return true;
        }

        //recursion
        int nextRow = row;
        int nextCol = col + 1;

        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return solveSudoku(sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <= n; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (solveSudoku(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        //row
        for (int i = 0; i < n; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        //col
        for (int j = 0; j < n; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        //grid
        int gridRowIdx = (row / 3) * 3;
        int gridColIdx = (col / 3) * 3;

        for (int i = gridRowIdx; i < gridRowIdx + 3; i++) {
            for (int j = gridColIdx; j < gridColIdx + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(int sudoku[][]) {
        System.out.println("----chess board----");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = {
            { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
            { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
            { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
            { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
            { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
            { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
            { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
            { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
            { 8, 2, 7, 0, 0, 9, 0, 1, 3 },
        };

        if (solveSudoku(sudoku, 0, 0)) {
            printSudoku(sudoku);
            System.out.println("\nSolution exists!");
        } else {
            System.out.println("Solution doesn't exist!");
        }
    }
}
