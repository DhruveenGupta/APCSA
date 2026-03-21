package unit05_arrays.practice;

import java.util.ArrayList;

public class WeatherDataRunner {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        // Create sample temperature data
        ArrayList<Double> temps = new ArrayList<>();
        temps.add(65.5);
        temps.add(68.0);
        temps.add(85.3);
        temps.add(88.7);
        temps.add(92.1);
        temps.add(95.4);
        temps.add(94.2);
        temps.add(91.5);
        temps.add(72.0);
        temps.add(70.3);
        temps.add(98.6);
        temps.add(100.2);
        temps.add(99.8);
        temps.add(75.0);
        
        // Set the temperatures using reflection since it's private
        try {
            java.lang.reflect.Field field = WeatherData.class.getDeclaredField("temperatures");
            field.setAccessible(true);
            field.set(weatherData, temps);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Original temperatures: " + temps);
        System.out.println("Count: " + temps.size());
        
        // Test longestHeatWave with threshold of 85.0
        int heatWave = weatherData.longestHeatWave(85.0);
        System.out.println("\nLongest heat wave (threshold 85.0): " + heatWave + " days");
        
        // Test cleanData to remove temps outside 60-100 range
        weatherData.cleanData(60.0, 100.0);
        System.out.println("\nAfter cleaning data (60-100 range): " + temps);
        System.out.println("Count after cleaning: " + temps.size());
    }
}
