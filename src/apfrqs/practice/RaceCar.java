package apfrqs.practice;

public class RaceCar {
    private String name;
    private double baseLapTime;

    public RaceCar(String name, double baseLapTime) {
        this.name = name;
        this.baseLapTime = baseLapTime;
    }

    public double getLapTime(int lapNum) {
        // Example lap time formula: base time plus a small incremental increase each lap.
        return baseLapTime + 0.15 * lapNum;
    }

    public String getName() {
        return name;
    }
}
