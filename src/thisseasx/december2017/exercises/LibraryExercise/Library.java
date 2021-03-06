package thisseasx.december2017.exercises.LibraryExercise;

class Library {

    // Fields.
    private final Book[] books;
    private final Librarian librarian = new Librarian();

    // Constructor.
    Library(Book[] books) {
        this.books = books;
    }

    // Getter for Librarian.
    Librarian getLibrarian() {
        return librarian;
    }

    // Inner Librarian Class that has access to the Library's books.
    class Librarian {

        // Empty constructor used above in Library.
        private Librarian() {
        }

        // Search method for Book, takes a Book argument.
        Book findBook(Book book) {
            return findBook(book.getTitle());
        }

        // Search method for Book, takes a String argument.
        Book findBook(String title) {
            System.out.printf("Searching for book '%s'...\n\n", title);
            for (Book book : books) {
                if (book.getTitle().equals(title)) return book;
            }
            return null;
        }

        // Search method for Author, takes a Author argument.
        Author findAuthor(Author author) {
            return findAuthor(author.getName());
        }

        // Search method for Author, takes a String argument.
        Author findAuthor(String authorName) {
            System.out.printf("Searching for author '%s'...\n\n", authorName);
            for (Book book : books) {
                for (Author author : book.getAuthors()) {
                    if (author.getName().equals(authorName)) return author;
                }
            }
            return null;
        }
    }
}
