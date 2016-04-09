package Question4AbstractFactory;

/**
 * Created for abstract factory pattern question
 * @author Annabel
 */
public class LondonXMLFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        switch (parserType) {
            case "LondonERROR":
                return new LondonErrorXMLParser();
            case "LondonFEEDBACK":
                return new LondonFeedbackXML();
            case "LondonORDER":
                return new LondonOrderXMLParser();
            case "LondonRESPONSE":
                return new LondonResponseXMLParser();
            default:
                System.out.println("Invalid Request");
                return null;
        }
    }
}
