package thisseasx.december2017.exercises.LibraryExercise;

public class Author {

    private String name;
    private String email;
    private String gender;

    Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    String getEmail() {
        return email;
    }
    void setEmail(String email) {
        this.email = email;
    }

    String getGender() {
        return gender;
    }
    void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("Author:\n" +
                "        Name: %s\n" +
                "        Email: %s\n" +
                "        Gender: %s", name, email, gender);
    }
}
