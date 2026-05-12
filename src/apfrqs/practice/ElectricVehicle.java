package apfrqs.practice;

public class ElectricVehicle {
    private String modelName;
    private int batteryCapacity; // in kWh
    private double efficiency; // miles per kWh

    public ElectricVehicle(String modelName, int batteryCapacity, double efficiency) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;
        this.efficiency = efficiency;
    }

    public int getRange() {
        return (int) (batteryCapacity * efficiency);
    }

    public String getModelName() {
        return modelName;
    }
}

