package Question4AbstractFactory;

/**
 * Created for abstract factory pattern question
 * @author Annabel
 */
public class NYCXMLFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        if(parserType.equals("NYCERROR")) {
            return new NYCErrorXMLParser();
        } else if(parserType.equals("NYCFEEDBACK")){
            return new NYCFeedbackXML();
        } else if(parserType.equals("NYCORDER")){
            return new NYCOrderXMLParser();
        } else if(parserType.equals("NYCRESPONSE")){
            return new NYCResponseXMLParser();
        } else {
            System.out.println("Invalid Request");
            return null;
        }
    }
}
