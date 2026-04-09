package unit02_conditionals.practice;

public class CheckMailRunner {
    public static void main(String[] args) {
        // Test 1: Package too large and too heavy (size = 8x3 = 24, weight = 75)
        CheckMail package1 = new CheckMail(8, 8, 3, 75);
        System.out.println("Package 1 (8x8x3, 75 lbs):");
        System.out.println("  Size: " + package1.size());
        System.out.println("  Status: " + package1.isTooBigorHeavy());
        System.out.println();

        // Test 2: Package too large and too heavy (size = 11x10 = 110, weight = 75)
        CheckMail package2 = new CheckMail(8, 11, 10, 75);
        System.out.println("Package 2 (8x11x10, 75 lbs):");
        System.out.println("  Size: " + package2.size());
        System.out.println("  Status: " + package2.isTooBigorHeavy());
        System.out.println();

        // Test 3: Package too large but acceptable weight (size = 11x10 = 110, weight = 60)
        CheckMail package3 = new CheckMail(8, 11, 10, 60);
        System.out.println("Package 3 (8x11x10, 60 lbs):");
        System.out.println("  Size: " + package3.size());
        System.out.println("  Status: " + package3.isTooBigorHeavy());
        System.out.println();

        // Test 4: Package acceptable size but too heavy (size = 5x5 = 25, weight = 75)
        CheckMail package4 = new CheckMail(5, 5, 5, 75);
        System.out.println("Package 4 (5x5x5, 75 lbs):");
        System.out.println("  Size: " + package4.size());
        System.out.println("  Status: " + package4.isTooBigorHeavy());
        System.out.println();

        // Test 5: Package acceptable (size = 5x5 = 25, weight = 60)
        CheckMail package5 = new CheckMail(5, 5, 5, 60);
        System.out.println("Package 5 (5x5x5, 60 lbs):");
        System.out.println("  Size: " + package5.size());
        System.out.println("  Status: " + package5.isTooBigorHeavy());
        System.out.println();

        // Test 6: Default constructor
        CheckMail package6 = new CheckMail();
        System.out.println("Package 6 (default constructor):");
        System.out.println("  Size: " + package6.size());
        System.out.println("  Status: " + package6.isTooBigorHeavy());
    }
}
