package unit07_2darrays.practice;

public class DataRunner {
    public static void main(String[] args) {
        // Create a Data object with a 5x5 grid
        Data data = new Data(5, 5);

        // Repopulate the grid with random values
        data.repopulate();

        // Count and print the number of increasing columns
        int increasingCols = data.countIncreasingCols();
        System.out.println("Number of increasing columns: " + increasingCols);
    }
}