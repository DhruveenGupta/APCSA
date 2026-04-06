package unit07_2darrays.practice;

public class GridPathRunner {
    public static void main(String[] args) {
        // Sample grid
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        GridPath path = new GridPath(grid);
        int sum = path.sumPath(0, 0);
        System.out.println("Sum of the path: " + sum);
    }
}