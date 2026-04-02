package unit07_2darrays.practice;

public class SumOrSameGame {
    private int[][] puzzle;
    public SumOrSameGame(int numRows, int numCols){
    puzzle = new int[numRows][numCols];
    for (int row = 0; row < numRows; row++) {
        for (int col = 0; col < numCols; col++) {
            puzzle[row][col] = (int)(Math.random() * 9) + 1;
        }
    }
    }
    public boolean clearPair(int row, int col){
        if (row < 0 || row >= puzzle.length || col < 0 || col >= puzzle[0].length) {
            throw new IllegalArgumentException("Row and column must be within the bounds of the puzzle.");
        }
        int value = puzzle[row][col];
        boolean cleared = false;
        for (int r = 0; r < puzzle.length; r++) {
            for (int c = 0; c < puzzle[0].length; c++) {
                if ((r == row && c != col) || (r != row && c == col)) {
                    if (puzzle[r][c] == value) {
                        puzzle[r][c] = 0;
                        cleared = true;
                    break;
                    }
                }
            }
        }
        if (cleared) {
            puzzle[row][col] = 0;
        }
        return cleared;
    }
}
