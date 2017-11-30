package thisseasx.november2017.exercises;

public class BookExercise {
    public static void main(String[] args) {

        Author jkRowling = new Author(
                "J.K.Rowling",
                "jkrowling@gmail.com",
                "female");

        Book harryPotter = new Book(
                "Harry Potter",
                jkRowling,
                100,
                9999);

        System.out.println(harryPotter.toString());
    }
}
