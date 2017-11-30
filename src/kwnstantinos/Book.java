package kwnstantinos;

public class Book {

    String name;
    Author author;
    double price;
    int qty;

    Book (String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String toString() {
        return "Book Title is: " + name +
                ", author's data are: " + author.toString() +
                ", the book costs: " + price +
                ", and we will order " + qty + " books.";
    }
}
