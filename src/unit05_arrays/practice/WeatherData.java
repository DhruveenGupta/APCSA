package unit05_arrays.practice;

import java.util.ArrayList;

public class WeatherData {
    private ArrayList<Double> temperatures;
    public void cleanData(double lower, double upper){
        for (int i = temperatures.size() - 1; i >= 0; i--){
            double t = temperatures.get(i);
            if(t < lower || t > upper){
                temperatures.remove(i);
            }
        }
    }
    public int longestHeatWave(double threshold){
        int longest = 0;
        int current = 0;
        for (double t : temperatures){
            if (t > threshold){
                current++;
            } else {
                longest = Math.max(longest, current);
                current = 0;
            }
        }
        return longest;
    }
}
