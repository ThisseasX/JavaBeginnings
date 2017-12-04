package thisseasx.december2017.exercises.LibraryExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class Book {

    private String title;
    private List<Author> authors;
    private int price;
    private int qty;

    // Constructor with a List of Authors.
    Book(String title, List<Author> authors, int price, int qty) {
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // Constructor chaining with a single Author.
    Book(String title, Author author, int price, int qty) {
        this(title, new ArrayList<>(Collections.singletonList(author)), price, qty);
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
