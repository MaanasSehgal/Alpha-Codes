public class NRooks {

    static int n = 3;
    static int count = 0;

    public static void nRooks(char board[][], int row) {
        //basecase
        if (row == n) {
            count++;
            printBoard(board);
            return;
        }

        //recursion
        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'R';
                nRooks(board, row + 1);
                board[row][j] = 'X';
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        //top
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'R') {
                return false;
            }
        }
        return true;
    } 

    public static void printBoard(char board[][]) {
        System.out.println("---Chess Board---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char board[][] = new char[n][n];

        //initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nRooks(board, 0);
        System.out.println("Number of ways: " + count);
    }
}
