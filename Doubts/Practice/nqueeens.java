public class nqueeens {

    static int count = 0;

    public static void printBoard(char board[][]) {
        int N = board.length;

        System.out.println("-------chessboard-------");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void nQueens(char board[][], int row) {
        //base case
        if (row == board.length) {
            count++;
            printBoard(board);
            return;
        }

        //kaam
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'X';
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        //upr
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        //upr left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //upr right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int N = 4;
        char board[][] = new char[N][N];

        //initialize the board with all X

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);

        System.out.println("Total ways: " + count);
    }
}
