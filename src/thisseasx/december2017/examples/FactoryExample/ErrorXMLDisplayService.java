package thisseasx.december2017.examples.FactoryExample;

public class ErrorXMLDisplayService extends DisplayService {

    @Override
    protected XMLParser getParser() {
        return new ErrorXMLParser();
    }
}
