package thisseasx.december2017.exercises;

class Library {

    // Fields.
    private Book[] books;
    private Librarian librarian;

    // Singleton Pattern.
    Librarian getLibrarian() {
        if (librarian == null) librarian = new Librarian();
        return librarian;
    }

    // Private empty constructor to disable creation of empty Library objects from outside.
    @SuppressWarnings("unused")
    private Library() {
    }

    // Default constructor.
    Library(Book[] books) {
        this.books = books;
    }

    // Inner Librarian Class that has access to the Library's books.
    class Librarian {

        // Empty constructor used above in Library.
        private Librarian() {
        }

        // Search method for Book, takes a Book argument.
        Book searchBook(Book book) {
            return searchBook(book.getTitle());
        }

        // Search method for Book, takes a String argument.
        Book searchBook(String title) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) return book;
            }
            return null;
        }

        // Search method for Author, takes a Author argument.
        Author searchAuthor(Author author) {
            return searchAuthor(author.getName());
        }

        // Search method for Author, takes a String argument.
        Author searchAuthor(String authorName) {
            for (Book book : books) {
                for (Author author : book.getAuthors()) {
                    if (author.getName().equals(authorName)) return author;
                }
            }
            return null;
        }
    }
}
