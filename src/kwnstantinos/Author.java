package kwnstantinos;

public class Author {

    String authorName;
    String email;
    String gender;

    Author (String authorName, String email, String gender){
        this.authorName = authorName;
        this.email = email;
        this.gender = gender;
    }

    public String toString() {
        return "Author's name is: " + authorName +
                ", his email is: " + email +
                ", and his Gender is: " + gender + " :)";
    }
}
