package apfrqs.year4;

public class Book {
    private String title;
    private double price;
    public Book(){
        title = "Unknown";
        price = 0.0;
    }

    public Book(String bookTitle, double bookPrice) {
        this.title = bookTitle;
        this.price = bookPrice;
    }

    public String getTitle() {
        return title;
    }

    public String getBookInfo() {
        return title + "-" + price;
    }
}
