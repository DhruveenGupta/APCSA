package apfrqs.practice;

public class Player {
    private String ID;
    private int score;

    public Player(String ID, int score) {
        this.ID = ID;
        this.score = score;
    }

    public String getID() {
        return ID;
    }
    public int getScore() {
        return score;
    }
}
