package unit06_arraylist.practice;

import java.util.ArrayList;

public class StatisticsRunner {
    public static void main(String[] args) {
        // Test 1: Simple list
        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(1);
        test1.add(2);
        test1.add(3);
        test1.add(4);
        test1.add(5);
        System.out.println("=== Test 1: Simple list (1,2,3,4,5) ===");
        runStatistics(test1);
        System.out.println();

        // Test 2: List with duplicates
        ArrayList<Integer> test2 = new ArrayList<>();
        test2.add(10);
        test2.add(10);
        test2.add(20);
        test2.add(20);
        test2.add(20);
        test2.add(30);
        System.out.println("=== Test 2: List with duplicates (10,10,20,20,20,30) ===");
        runStatistics(test2);
        System.out.println();

        // Test 3: Single element
        ArrayList<Integer> test3 = new ArrayList<>();
        test3.add(42);
        System.out.println("=== Test 3: Single element (42) ===");
        runStatistics(test3);
        System.out.println();

        // Test 4: Empty list (would cause division by zero, but we'll skip std dev)
        ArrayList<Integer> test4 = new ArrayList<>();
        System.out.println("=== Test 4: Empty list ===");
        if (!test4.isEmpty()) {
            runStatistics(test4);
        } else {
            System.out.println("List is empty, cannot calculate statistics.");
        }
    }

    private static void runStatistics(ArrayList<Integer> numbers) {
        double average = Statistics.calculateAverage(numbers);
        int mode = Statistics.findMode(numbers);
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Mode: %d%n", mode);
        if (numbers.size() > 1) {
            double stdDev = Statistics.calculateStandardDeviation(numbers, average);
            System.out.printf("Standard Deviation: %.2f%n", stdDev);
        } else {
            System.out.println("Standard Deviation: N/A (need at least 2 elements)");
        }
    }
}