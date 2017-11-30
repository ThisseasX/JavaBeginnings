package kwnstantinos;

public class BookTest {

    public static void main(String[] args) {

        Author authorPublic = new Author("John Woo", "ever@what", "lgbtqi+");
        Book book = new Book("titlos", authorPublic, 20, 300);

        System.out.println(book.toString());

        System.out.println(book.toString());
    }
}
