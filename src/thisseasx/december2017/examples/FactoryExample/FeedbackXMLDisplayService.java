package thisseasx.december2017.examples.FactoryExample;

public class FeedbackXMLDisplayService extends DisplayService {

    @Override
    protected XMLParser getParser() {
        return new FeedbackXMLParser();
    }
}
