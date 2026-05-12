package apfrqs.practice;

public class ElectricVehicleRunner {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 100, 3.5);
        ElectricVehicle nissan = new ElectricVehicle("Nissan Leaf", 40, 4.0);

        System.out.println(tesla.getModelName() + " range: " + tesla.getRange() + " miles");
        System.out.println(nissan.getModelName() + " range: " + nissan.getRange() + " miles");
    }
}