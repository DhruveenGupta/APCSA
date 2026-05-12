package apfrqs.practice;

public class Cube {
    private String cubeType;
    public Cube(String cubeType){
        if (!(cubeType.equals("number") || cubeType.equals("color") || cubeType.equals("letter"))) {
            throw new IllegalArgumentException("Invalid cube type: " + cubeType);
        }
        this.cubeType = cubeType;
    }
    public String roll(){
        if (cubeType.equals("number")) {
            return String.valueOf((int)(Math.random() * 6) + 1);
        } else if (cubeType.equals("color")) {
            String[] colors = {"Red", "Green", "Blue", "Yellow", "Purple", "Orange"};
            return colors[(int)(Math.random() * colors.length)];
        } else if (cubeType.equals("letter")) {
            String[] letters = {"A", "B", "C", "D", "E", "F"};
            return letters[(int)(Math.random() * letters.length)];
        } else {
            throw new IllegalStateException("Invalid cube type");
        }
    }
}
