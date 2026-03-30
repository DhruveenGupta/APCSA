package unit04_classes.practice;

public class FeederRunner {
    public static void main(String[] args) {
        // simulateOneDay test
        Feeder feederOneDay = new Feeder(300);
        System.out.println("=== simulateOneDay() Test ===");
        System.out.println("Initial food: " + feederOneDay.getCurrentFood());
        System.out.println("Birds: 8");
        feederOneDay.simulateOneDay(8);
        System.out.println("Food after one day: " + feederOneDay.getCurrentFood());
        System.out.println();

        // simulateManyDays test
        Feeder feederManyDays = new Feeder(1000);
        System.out.println("=== simulateManyDays() Test ===");
        System.out.println("Initial food: " + feederManyDays.getCurrentFood());
        System.out.println("Birds: 10, Days: 5");
        feederManyDays.simulateManyDays(10, 5);
        System.out.println("Food after 5 days: " + feederManyDays.getCurrentFood());
        System.out.println();

        // edge case: many days can reduce food to zero quickly
        Feeder feederManyDays2 = new Feeder(120);
        System.out.println("=== simulateManyDays() Edge Case ===");
        System.out.println("Initial food: " + feederManyDays2.getCurrentFood());
        System.out.println("Birds: 6, Days: 7");
        feederManyDays2.simulateManyDays(6, 7);
        System.out.println("Food after 7 days: " + feederManyDays2.getCurrentFood());
        System.out.println();

        // invalid case demonstration (commented out for safe run)
        // new Feeder(100).simulateManyDays(0, 3); // throws IllegalArgumentException
        // new Feeder(100).simulateManyDays(3, 0); // throws IllegalArgumentException
    }
}
