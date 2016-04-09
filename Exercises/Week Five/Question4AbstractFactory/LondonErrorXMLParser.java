package Question4AbstractFactory;

/**
 * Created for abstract factory pattern
 * @author Annabel
 */
public class LondonErrorXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("London Parsing Error XML...");
        return "London Error XML Parser";
    }
}
