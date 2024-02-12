public class KnightTourApproach2 {

    static int n = 8;

    public static void tour(int board[][], int row, int col, int moveNumber) {
        if (row >= n || col >= n || row < 0 || col < 0) {
            return;
        }

        if (board[row][col] != -1) {
            return;
        }

        if (moveNumber == (n * n) - 1) {
            printBoard(board);
            return;
        }

        board[row][col] = moveNumber;

        //all are in circular order
        tour(board, row - 2, col + 1, moveNumber + 1); //1
        tour(board, row - 1, col + 2, moveNumber + 1); //2
        tour(board, row + 1, col + 2, moveNumber + 1); //3
        tour(board, row + 2, col + 1, moveNumber + 1); //4
        tour(board, row + 2, col - 1, moveNumber + 1); //5
        tour(board, row + 1, col - 2, moveNumber + 1); //6
        tour(board, row - 1, col - 2, moveNumber + 1); //7
        tour(board, row - 2, col - 1, moveNumber + 1); //8

        board[row][col] = -1;
    }

    public static void printBoard(int board[][]) {
        System.out.println("---board---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int board[][] = new int[n][n];

        //initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = -1;
            }
        }
        tour(board, 0, 0, 0);
    }
}
