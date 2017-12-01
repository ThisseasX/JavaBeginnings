package thisseasx.december2017.exercises;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Book {

    private String title;
    private List<Author> authors = new ArrayList<>();
    private int price;
    private int qty;

    // Constructor with List of Authors.
    Book(String title, List<Author> author, int price, int qty) {
        this.title = title;
        this.authors = author;
        this.price = price;
        this.qty = qty;
    }

    // Constructor with single Author.
    Book(String title, Author author, int price, int qty) {
        this.title = title;
        this.authors.add(author);
        this.price = price;
        this.qty = qty;
    }

    String getTitle() {
        return title;
    }
    void setTitle(String title) {
        this.title = title;
    }

    List<Author> getAuthors() {
        return authors;
    }
    void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
    void addAuthor(Author author) {
        this.authors.add(author);
    }

    int getPrice() {
        return price;
    }
    void setPrice(int price) {
        this.price = price;
    }

    int getQty() {
        return qty;
    }
    void setQty(int qty) {
        this.qty = qty;
    }

    String getAuthorName(int index) {
        return authors.get(index).getName();
    }
    String getAuthorEmail(int index) {
        return authors.get(index).getEmail();
    }
    String getAuthorGender(int index) {
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
