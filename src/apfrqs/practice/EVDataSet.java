package apfrqs.practice;
import java.util.ArrayList;
public class EVDataSet {
    private ArrayList<ElectricVehicle> vehicles;
    public ArrayList<String> getHighRangeVehicles(int target){
        ArrayList<String> highRangeVehicles = new ArrayList<>();
        for (ElectricVehicle ev : vehicles) {
            if (ev.getRange() > target) {
                highRangeVehicles.add(ev.getModelName());
            }
        }
        return highRangeVehicles;
    }
}
