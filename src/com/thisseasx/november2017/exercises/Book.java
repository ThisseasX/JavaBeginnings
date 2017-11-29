package com.thisseasx.november2017.exercises;

public class Book {

    private String name;
    private Author author;
    private int price;
    private int qty;

    public Book(String name, Author author, int price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
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

    public String getAuthorName() {
        return author.getName();
    }

    public String getAuthorEmail() {
        return author.getEmail();
    }

    public String getAuthorGender() {
        return author.getGender();
    }

    @Override
    public String toString() {
        return String.format("Book[name=%s,%s,price=%s,qty=%s", name, author.toString(), price, qty);
    }
}
