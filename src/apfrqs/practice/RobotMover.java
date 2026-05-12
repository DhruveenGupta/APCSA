package apfrqs.practice;

public class RobotMover {
    private String moveSequence;
    public RobotMover (int numMoves) {
        moveSequence = "";
        for (int i = 0; i < numMoves; i++){
            int move = (int) (Math.random() * 4) + 1;
            if (move == 1) {
                moveSequence += "up_";
            } else if (move == 2) {
                moveSequence += "down_";
            } else if (move == 3) {
                moveSequence += "right_";
            } else {
                moveSequence += "left_";
            }
        }
    }
    public int countOccurences(String str){
        int count = 0;
        for (int i = 0; i < moveSequence.length(); i++){
            if (moveSequence.substring(i, i + str.length()).equals(str)){
                count++;
            }
        }        return count;
    }
}
