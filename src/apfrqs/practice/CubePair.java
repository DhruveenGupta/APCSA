package apfrqs.practice;

public class CubePair {
    private Cube cube1;
    private Cube cube2;
    private Cube cube;
    public CubePair(String cubeType1, String cubeType2) {
        this.cube1 = new Cube(cubeType1);
        this.cube2 = new Cube(cubeType2);
    }
    public CubePair(String cubeType) {
        this.cube = new Cube(cubeType);
    }
    public String rollCubes(){
        if (cube1 != null && cube2 != null) {
            return cube1.roll() + " " + cube2.roll();
        } else if (cube != null) {
            return cube.roll();
        } else {
            throw new IllegalStateException("No cubes to roll");
        }
    }
}
