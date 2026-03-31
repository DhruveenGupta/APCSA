package unit07_2darrays.practice;

public class KnightsTour {
    private static final int SIZE = 8;
    private int[][] board;
    private int[] rowMoves = {2, 1, -1, -2, -2, -1, 1, 2};
    private int[] colMoves = {1, 2, 2, 1, -1, -2, -2, -1};

    public KnightsTour() {
        board = new int[SIZE][SIZE];
        solveKnightsTour();
        printBoard();
    }

    private void solveKnightsTour() {
        java.util.Random rand = new java.util.Random();
        int row = 0, col = 0;
        int moveCount = 1;
        board[row][col] = moveCount;
        
        while (moveCount < SIZE * SIZE) {
            int nextMove = -1;
            int[] availableMoves = new int[8];
            int moveCount2 = 0;
            
            for (int i = 0; i < 8; i++) {
                int newRow = row + rowMoves[i];
                int newCol = col + colMoves[i];
                if (isValid(newRow, newCol)) {
                    availableMoves[moveCount2++] = i;
                }
            }
            
            if (moveCount2 == 0) break;
            
            nextMove = availableMoves[rand.nextInt(moveCount2)];
            row += rowMoves[nextMove];
            col += colMoves[nextMove];
            board[row][col] = ++moveCount;
        }
    }

    private boolean isValid(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == 0;
    }

    private void printBoard() {
        System.out.println("    1   2   3   4   5   6   7   8");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%3d ", board[i][j]);
            }
            System.out.println();
        }
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] != 0) count++;
            }
        }
        System.out.println(count + " squares were visited");
    }

    public static void main(String[] args) {
        new KnightsTour();
    }
}
