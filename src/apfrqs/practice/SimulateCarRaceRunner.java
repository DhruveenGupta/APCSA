package apfrqs.practice;

public class SimulateCarRaceRunner {
    public static void main(String[] args) {
        RaceCar car1 = new RaceCar("Speedy", 65.0);
        RaceCar car2 = new RaceCar("Lightning", 64.5);

        SimulateCarRace race = new SimulateCarRace(car1, car2);
        int numLaps = 5;

        System.out.println("Race setup:");
        System.out.println(car1.getName() + " base lap time: " + car1.getLapTime(0));
        System.out.println(car2.getName() + " base lap time: " + car2.getLapTime(0));
        System.out.println();

        System.out.println("Lap times:");
        for (int i = 1; i <= numLaps; i++) {
            System.out.printf("Lap %d - %s: %.2f, %s: %.2f%n",
                    i,
                    car1.getName(), car1.getLapTime(i),
                    car2.getName(), car2.getLapTime(i));
        }

        System.out.println();
        System.out.println("Result after " + numLaps + " laps:");
        System.out.println(race.findWinner(numLaps));
    }
}
