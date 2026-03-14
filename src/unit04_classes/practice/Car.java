/* Implement a Car class with the following properties.

A Car keeps track of the starting odometer reading, ending odometer reading, and the number of gallons used between readings.

The initial odometer reading is specified in the constructor.

A method calculateMPG calculates and returns the miles per gallon for the car.

A method fillUp simulates filling up the tank at a gas station: odometerReading is the current odometer reading and gallons is the number of gallons that filled the tank. Save these values in instance variables.

With this information, miles per gallon can be calculated. calculateMPG will calculate the miles per gallon since the last time resetMPG was called. */


package unit04_classes.practice;

public class Car {
    private int myStartMiles;
    private int myEndMiles;
    private double myGallonsUsed;

    Car(int odometerReading){
        this.myStartMiles = odometerReading;
    }

    void fillUp(int odometerReading, double gallons){
        this.myEndMiles = odometerReading;
        this.myGallonsUsed += gallons;
    }

    double calculateMPG(){
        return (myEndMiles - myStartMiles)/myGallonsUsed;
    }

    double resetMPG() {
        myStartMiles = myEndMiles;
        myGallonsUsed = 0.0;
        return 0.0;
    }


public static void main(String [] args) {
    Car auto = new Car(15);
    System.out.println("New car odometer reading: " + auto.myStartMiles);
    auto.fillUp(150,8);
    System.out.println("Miles per gallon " + auto.calculateMPG());
    System.out.println("Miles per gallon " + auto.calculateMPG());
    auto.resetMPG();
    // start miles is 150, gallons uses is 0
    auto.fillUp(350, 10);
    auto.fillUp(450, 20);
    System.out.println("Miles per gallon " + auto.calculateMPG());
    auto.resetMPG();
    auto.fillUp(603, 25.5);
    System.out.println("Miles per gallon " + auto.calculateMPG());
    }
}