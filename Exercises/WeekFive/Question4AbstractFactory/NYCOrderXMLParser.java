package Question4AbstractFactory;

/**
 * Created for abstract factory pattern
 * @author Annabel
 */
public class NYCOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NYC Parsing Order XML...");
        return "NYC Order XML Parser";
    }
}
