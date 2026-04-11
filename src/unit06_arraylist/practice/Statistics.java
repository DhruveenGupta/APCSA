package unit06_arraylist.practice;

public class Statistics {
    private static final String FILENAME = "numbers.txt";

    public static void main(String[] args) throws java.io.IOException {
        java.util.ArrayList<Integer> numbers = readFile(FILENAME);
        
        double average = calculateAverage(numbers);
        double stdDev = calculateStandardDeviation(numbers, average);
        int mode = findMode(numbers);
        
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Standard Deviation: %.2f%n", stdDev);
        System.out.printf("Mode: %d%n", mode);
    }

    public static java.util.ArrayList<Integer> readFile(String filename) throws java.io.IOException {
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();
        java.util.Scanner scanner = new java.util.Scanner(new java.io.File(filename));
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        scanner.close();
        return numbers;
    }

    public static double calculateAverage(java.util.ArrayList<Integer> numbers) {
        long sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }

    public static double calculateStandardDeviation(java.util.ArrayList<Integer> numbers, double average) {
        double sumSquaredDifferences = 0;
        for (int num : numbers) {
            double difference = num - average;
            sumSquaredDifferences += difference * difference;
        }
        return Math.sqrt(sumSquaredDifferences / (numbers.size() - 1));
    }

    public static int findMode(java.util.ArrayList<Integer> numbers) {
        int[] frequency = new int[101];
        for (int num : numbers) {
            frequency[num]++;
        }
        int mode = 0;
        int maxFrequency = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mode = i;
            }
        }
        return mode;
    }
}
