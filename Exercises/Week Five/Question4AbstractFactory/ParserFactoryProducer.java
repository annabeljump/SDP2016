package Question4AbstractFactory;

/**
 * Created for abstract factory pattern question
 * @author Annabel
 */
public class ParserFactoryProducer {

    public static AbstractParserFactory getFactory(String str){
        if (str == "NYCFactory"){
            return new NYCXMLFactory();
        } else if (str == "LondonFactory") {
            return new LondonXMLFactory();
        } else
            System.out.println("Invalid Request");
        return null;
    }
}
