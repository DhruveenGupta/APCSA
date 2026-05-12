package apfrqs.practice;
import java.util.ArrayList;
public class PlayerAnalysis {
    private ArrayList<Player> playerList;
    public String playerWithClosestScore(int targetScore){
        if (playerList == null || playerList.isEmpty()){
            return "No player found";
        }
        Player closest = null;
        int bestDiff = Integer.MAX_VALUE;
        for (Player p : playerList){
            int diff = Math.abs(p.getScore() - targetScore);
            if (diff < bestDiff){
                bestDiff = diff;
                closest = p;
            }
        }
        return closest != null ? closest.getID() : "No player found";
    }
}
