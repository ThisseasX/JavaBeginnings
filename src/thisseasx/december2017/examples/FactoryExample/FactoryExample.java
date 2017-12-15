package thisseasx.december2017.examples.FactoryExample;

public class FactoryExample {

    public static void main(String[] args) {
        DisplayService service = new FeedbackXMLDisplayService();
        service.display();

        service = new ErrorXMLDisplayService();
        service.display();
    }
}
