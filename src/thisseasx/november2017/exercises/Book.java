package thisseasx.november2017.exercises;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private List<Author> authors = new ArrayList<>();
    private int price;
    private int qty;

    public Book(String title, List<Author> author, int price, int qty) {
        this.title = title;
        this.authors = author;
        this.price = price;
        this.qty = qty;
    }

    public Book(String title, Author author, int price, int qty) {
        this.title = title;
        this.authors.add(author);
        this.price = price;
        this.qty = qty;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName(int index) {
        return authors.get(index).getName();
    }

    public String getAuthorEmail(int index) {
        return authors.get(index).getEmail();
    }

    public String getAuthorGender(int index) {
        return authors.get(index).getGender();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book:\n");
        sb.append("    Title: ").append(title).append("\n");

        for (Author author : authors) {
            sb.append("    ").append(author).append("\n");
        }

        sb.append("    Price: ").append(price).append("\n");
        sb.append("    Quantity: ").append(qty).append("\n");

        return sb.toString();
    }
}
