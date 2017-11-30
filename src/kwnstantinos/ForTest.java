package kwnstantinos;

public class ForTest {
    public static void main(String[] args) {
        String string = "Hello my name is Kon";
// askisi: na anathespume ton kathe ksexwristo char tou string se ena char array (pinaka me characters)
        char[] answer; // declaration --> dilwsi metavlitis
        // i = i + 1
        // i += 1
        // i++
        // Synonyma metaksy tous
        answer = new char[string.length()];
        // initialisation --> arxikopoiisi, i variable pairnei tin prwti tis timi
        // i variable answer apoteleitai apo new char(s) megethous [string.length()]

        // ftiaxnoume loop i opoia anathetei times i stin variable
        for (int i = 0; i <= string.length() - 1; i++) {
            answer[i] = string.charAt(i);
        }

        System.out.println(answer);
    }
}
