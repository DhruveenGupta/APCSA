package apfrqs.practice;

public class AppleCrate {
    private Apple[][] apples;
    public int numberOfPies(double poundsPerPie){
        double totalWeight = 0.0;
        for (int i = 0; i < apples.length; i++) {
            for (int j = 0; j < apples[i].length; j++) {
                Apple apple = apples[i][j];
                if (apple.isRotten()) {
                    continue;
                }
                boolean adjacentRotten = false;
                if (i > 0 && apples[i-1][j].isRotten()) {
                    adjacentRotten = true;
                }
                if (i < apples.length - 1 && apples[i+1][j].isRotten()) {
                    adjacentRotten = true;
                }
                if (j > 0 && apples[i][j-1].isRotten()) {
                    adjacentRotten = true;
                }
                if (j < apples[i].length - 1 && apples[i][j+1].isRotten()) {
                    adjacentRotten = true;
                }
                if (!adjacentRotten) {
                    totalWeight += apple.getWeight();
                }
            }
        }
        return (int) (totalWeight / poundsPerPie);
    }
    
}
