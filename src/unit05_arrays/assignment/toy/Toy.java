public class Toy {
    private String name;
    private int count;

    public Toy(String name) {
        this.name = name;;
        count = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return name + ": " + count;
    }
}