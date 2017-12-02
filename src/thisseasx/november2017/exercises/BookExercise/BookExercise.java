package thisseasx.november2017.exercises.BookExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookExercise {
    public static void main(String[] args) {

        Author jkRowling = new Author(
                "J.K.Rowling",
                "jkrowling@gmail.com",
                "female"
        );

        Author tolkien = new Author(
                "Tolkien",
                "tolkien@yahoo.gr",
                "male"
        );

        List<Author> authors = new
                ArrayList<>(
                Arrays.asList(
                        jkRowling,
                        tolkien
                )
        );

        Book harryPotter = new Book(
                "Harry Potter",
                authors,
                100,
                9999
        );

        Book superBook = new Book(
                "BestBookInTheWorld",
                new Author("BestAuthor",
                        "topauthor@best.com",
                        "female"
                ),
                33,
                123
        );

        harryPotter.addAuthor(new Author(
                "Kavafy",
                "kavafy@facebook.com",
                "male"
        ));

        superBook.addAuthor(jkRowling);

        System.out.println(harryPotter);
        System.out.println(superBook);
    }
}
