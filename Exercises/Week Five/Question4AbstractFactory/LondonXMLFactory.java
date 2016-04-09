package Question4AbstractFactory;

/**
 * Created for abstract factory pattern question
 * @author Annabel
 */
public class LondonXMLFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        if(parserType.equals("LondonERROR")) {
            return new LondonErrorXMLParser();
        } else if(parserType.equals("LondonFEEDBACK")){
            return new LondonFeedbackXML();
        } else if(parserType.equals("LondonORDER")){
            return new LondonOrderXMLParser();
        } else if(parserType.equals("LondonRESPONSE")){
            return new LondonResponseXMLParser();
        } else {
            System.out.println("Invalid Request");
            return null;
        }
    }
}
