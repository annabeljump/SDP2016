package Question4AbstractFactory;

/**
 * Created for abstract factory pattern question
 * @author Annabel
 */
public class NYCXMLFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        switch (parserType) {
            case "NYCERROR":
                return new NYCErrorXMLParser();
            case "NYCFEEDBACK":
                return new NYCFeedbackXML();
            case "NYCORDER":
                return new NYCOrderXMLParser();
            case "NYCRESPONSE":
                return new NYCResponseXMLParser();
            default:
                System.out.println("Invalid Request");
                return null;
        }
    }
}
