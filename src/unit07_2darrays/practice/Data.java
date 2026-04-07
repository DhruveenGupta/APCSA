package unit07_2darrays.practice;

public class Data {
    private static final int MAX = (int)(Math.random() * 1000) + 1;
    private int[][] grid;

    public Data(int rows, int cols) {
        grid = new int[rows][cols];
    }

    public void repopulate(){
        if (grid == null || grid.length == 0 || grid[0].length == 0){
            throw new IllegalStateException("Grid must be initialized with non-zero dimensions.");
        }
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                grid[i][j] = (int)(Math.random() * MAX) + 1;
                if (grid[i][j] % 100 == 0){
                    grid[i][j] = (int)(Math.random() * MAX) + 1;
                }
                if (grid[i][j] % 10 != 0){
                    grid[i][j] = (int)(Math.random() * MAX) + 1;
                }
            }
        }
    }
    public int countIncreasingCols() {
        int count = 0;
        if (grid == null || grid.length == 0) {
            return 0;
        }
        for (int col = 0; col < grid[0].length; col++) {
            boolean increasing = true;
            for (int row = 0; row < grid.length - 1; row++) {
                if (grid[row + 1][col] < grid[row][col]) {
                    increasing = false;
                    break;
                }
            }
            if (increasing) {
                count++;
            }
        }
        return count;
    }
}

