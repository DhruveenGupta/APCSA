package unit04_classes.practice;

import java.util.Random;

public class Feeder {
    private int currentFood;

    public Feeder(){
        currentFood = 0;
    }

    public Feeder(int initialFood){
        if (initialFood < 0){
            throw new IllegalArgumentException("Initial food must be non-negative.");
        }
        currentFood = initialFood;
    }

    public void simulateOneDay(int numBirds){
        if(numBirds <= 0){
            throw new IllegalArgumentException("Number of birds must be positive.");
        }
        Random chance = new Random();
        int event = chance.nextInt(100) + 1;
        Random rand = new Random();
        int numFoodPerBird = rand.nextInt(41) + 10;
        System.out.println("Amount of food per bird: " + numFoodPerBird);
        if (currentFood == 0){
            return;
        }
        if (event <= 95){
            if (currentFood < numBirds * numFoodPerBird){
                currentFood = 0;
                return;
            }

            for (int i = 0; i < numBirds; i++){
                if (currentFood == 0){
                    return;
                }
                currentFood -= numFoodPerBird;
            }
        }
        else if (event > 95){
            currentFood = 0;
        }
    }

    public void simulateManyDays(int numBirds, int days){
        if(days <= 0){
            throw new IllegalArgumentException("Number of days must be positive.");
        }
        if(numBirds <= 0){
            throw new IllegalArgumentException("Number of birds must be positive.");
        }
        for (int i = 0; i < days; i++){
            simulateOneDay(numBirds);
        }

    }

    public int getCurrentFood(){
        return currentFood;
    }
}
