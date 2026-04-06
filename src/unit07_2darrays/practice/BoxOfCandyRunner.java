package unit07_2darrays.practice;

public class BoxOfCandyRunner {
    public static void main(String[] args) {
        // Create a 3x3 box of candies
        Candy[][] candies = new Candy[3][3];
        candies[0][0] = new Candy("chocolate");
        candies[0][1] = new Candy("vanilla");
        candies[0][2] = new Candy("strawberry");
        candies[1][0] = new Candy("mint");
        candies[1][1] = null; // empty spot
        candies[1][2] = new Candy("lemon");
        candies[2][0] = new Candy("chocolate");
        candies[2][1] = new Candy("vanilla");
        candies[2][2] = null; // empty spot

        BoxOfCandy box = new BoxOfCandy(candies);

        // Print initial box
        System.out.println("Initial Box:");
        box.printBox();

        // Test moveCandyToFirstRow for column 1 (vanilla in row 2)
        System.out.println("\nMoving candy to first row in column 1:");
        boolean moved = box.moveCandyToFirstRow(1);
        System.out.println("Move successful: " + moved);
        box.printBox();

        // Test removeNextByFlavor for "chocolate"
        System.out.println("\nRemoving next chocolate candy:");
        Candy removed = box.removeNextByFlavor("chocolate");
        if (removed != null) {
            System.out.println("Removed: " + removed.getFlavor());
        } else {
            System.out.println("No chocolate candy found");
        }
        box.printBox();

        // Test removeNextByFlavor for a flavor not present
        System.out.println("\nRemoving next raspberry candy:");
        removed = box.removeNextByFlavor("raspberry");
        if (removed != null) {
            System.out.println("Removed: " + removed.getFlavor());
        } else {
            System.out.println("No raspberry candy found");
        }
    }
}