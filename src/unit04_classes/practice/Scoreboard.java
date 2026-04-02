package unit04_classes.practice;

public class Scoreboard {
    private String team1;
    private String team2;
    private boolean team1Active = true;
    private boolean team2Active = false;
    private int team1Score = 0;
    private int team2Score = 0;
    public Scoreboard(){
        team1 = "";
        team2 = "";
    }
    public Scoreboard(String text, String text2){
        team1 = text;
        team2 = text2;
    }
    public void recordPlay(int score){
        if (score < 0) {
            throw new IllegalArgumentException("Score cannot be negative");
        }
        if (score > 0){
            if (team1Active) {
                team1Score += score;
            } else {
                team2Score += score;
            }
        }
        else if(score == 0){
            team1Active = !team1Active;
            team2Active = !team2Active;
        }
    }
    public String getScore(){
        if (team1Active) {
            return team1Score + " - " + team2Score + " - " + team1 + " (active)";
        } else {
            return team1Score + " - " + team2Score + " - " + team2 + " (active)";
        }
    }
}