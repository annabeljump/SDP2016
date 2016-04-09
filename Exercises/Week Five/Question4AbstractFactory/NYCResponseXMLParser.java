package Question4AbstractFactory;

/**
 * Created for abstract factory pattern
 * @author Annabel
 */
public class NYCResponseXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("NYC Parsing Response XML...");
        return "NYC Response XML Parser";
    }
}
