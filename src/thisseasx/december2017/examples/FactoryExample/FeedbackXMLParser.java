package thisseasx.december2017.examples.FactoryExample;

public class FeedbackXMLParser implements XMLParser {

    @Override
    public String parse() {
        System.out.println("Parsing feedback XML...");
        return "Feedback XML Message";
    }
}
