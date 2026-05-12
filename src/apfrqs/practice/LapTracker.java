package apfrqs.practice;

public class LapTracker {
    private int lap;
    private int lapReset;
    public LapTracker(int lapReset) {
        lap = 0;
        this.lapReset = lapReset;
    }
    private int temp = lapReset;
    public int addLaps(int laps){
        lap += laps;
        lapReset--;
        if(lapReset == 0){
            lap = 0;
            lapReset = temp;
        }
        return lap;
    }

}
