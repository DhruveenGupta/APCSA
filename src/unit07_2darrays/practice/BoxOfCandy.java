package unit07_2darrays.practice;

public class BoxOfCandy {
    private Candy[][] box;

    public BoxOfCandy(Candy[][] box) {
        this.box = box;
    }

    public boolean moveCandyToFirstRow(int col) {
        if (col < 0 || col >= box[0].length) {
            throw new IllegalArgumentException("Column index must be within the bounds of the box.");
        }
        if (box[0][col] != null){
            return true;
        }
        for (int row = 1; row < box.length; row++) {
            if (box[row][col] != null) {
                box[0][col] = box[row][col];
                box[row][col] = null;
                return true;
            }
        }
        return false;
    }

    public Candy removeNextByFlavor(String flavor){
        for (int row = 0; row < box.length; row++){
            for (int col = 0; col <box[row].length; col++){
                if (box[row][col] != null && box[row][col].getFlavor().equals(flavor)){
                    Candy removal = box[row][col];
                    box[row][col] = null;
                    return removal;
                }
            }
        }
        return null;
    }

    public void printBox() {
        for (int row = 0; row < box.length; row++) {
            for (int col = 0; col < box[row].length; col++) {
                if (box[row][col] != null) {
                    System.out.print(box[row][col].getFlavor() + " ");
                } else {
                    System.out.print("empty ");
                }
            }
            System.out.println();
        }
    }
}
