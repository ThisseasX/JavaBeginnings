package thisseasx.november2017.examples;

public class StringBuilderExample {
    public static void main(String[] args) {
        String s = "This is an example";
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        String out = sb.toString();
        System.out.println(out);
    }
}
