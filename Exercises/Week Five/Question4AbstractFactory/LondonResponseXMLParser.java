package Question4AbstractFactory;

/**
 * Created for abstract factory pattern
 * @author Annabel
 */
public class LondonResponseXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("London Parsing Response XML...");
        return "London Response XML Parser";
    }
}
