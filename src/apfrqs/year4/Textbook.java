package apfrqs.year4;

public class Textbook extends Book {
    private int edition;

    public Textbook(String title, double price, int edition) {
        super(title, price);
        this.edition = edition;
    }

    public String getBookInfo() {
        return super.getBookInfo() + " - Edition " + edition;
    }

    public boolean canSubstituteFor(Textbook other) {
        return this.getTitle().equals(other.getTitle()) && this.edition >= other.edition;
    }

    public int getEdition() {
        return edition;
    }

}