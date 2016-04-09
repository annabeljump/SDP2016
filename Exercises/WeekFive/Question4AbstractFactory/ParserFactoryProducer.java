package Question4AbstractFactory;

/**
 * Created for abstract factory pattern question
 * @author Annabel
 */
public class ParserFactoryProducer {

    public static AbstractParserFactory getFactory(String str){
        switch (str) {
            case "NYCFactory":
                return new NYCXMLFactory();
            case "LondonFactory":
                return new LondonXMLFactory();
            default:
                System.out.println("Invalid Request");
                break;
        }
        return null;
    }
}
