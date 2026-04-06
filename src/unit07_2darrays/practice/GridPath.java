package unit07_2darrays.practice;

public class GridPath {
    private int[][] grid;
    
    public GridPath(int[][] grid) {
        this.grid = grid;
    }
    
    public Location getNextLoc(int row, int col){
        Location right = new Location(row, col + 1);
        Location down = new Location(row + 1, col);
        if (right.getCol() < grid[0].length && down.getRow() < grid.length) {
            if (grid[right.getRow()][right.getCol()] > grid[down.getRow()][down.getCol()]) {
                return right;
            } else {
                return down;
            }
        } else if (right.getCol() < grid[0].length) {
            return right;
        } else if (down.getRow() < grid.length) {
            return down;
        } else {
            return null; // No more moves possible
        }
    }

    public int sumPath(int row, int col){
            int sum = 0;
            int curRow = row;
            int curCol = col;

            while (true) {
                sum += grid[curRow][curCol];
                if (curRow == grid.length - 1 && curCol == grid[0].length - 1) {
                    break;
                }
                Location next = getNextLoc(curRow, curCol);
                if (next == null) {
                    break;
                }
                curRow = next.getRow();
                curCol = next.getCol();
            }

            return sum;
        }
    }
