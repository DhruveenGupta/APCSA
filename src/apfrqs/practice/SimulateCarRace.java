package apfrqs.practice;

public class SimulateCarRace {
    private RaceCar carOne;
    private RaceCar carTwo;
    private double x;
    private double y;

    public SimulateCarRace(RaceCar carOne, RaceCar carTwo) {
        this.carOne = carOne;
        this.carTwo = carTwo;
    }

    public String findWinner(int numLaps) {
        x = 0;
        y = 0;
        for (int i = 1; i <= numLaps; i++) {
            x += carOne.getLapTime(i);
            y += carTwo.getLapTime(i);
        }
        if (x < y) {
            return "Car 1 wins!";
        } else if (y < x) {
            return "Car 2 wins!";
        } else {
            return "It's a tie!";
        }
    }

    public String shortenMessage(String message, String str) {
        return message.replace(str, "");
    }
}
