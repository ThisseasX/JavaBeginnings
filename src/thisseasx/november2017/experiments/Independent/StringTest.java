package thisseasx.november2017.experiments.Independent;

public class StringTest {
    public static void main(String[] args) {
        String a = "Hello how are you?";
        String b = " I am fine, thanks";
        int i = a.indexOf("o",8);
        a = a.concat(b);
        System.out.println(a);
        System.out.println(i);
    }
}
