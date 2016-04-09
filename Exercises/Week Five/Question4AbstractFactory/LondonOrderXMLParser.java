package Question4AbstractFactory;

/**
 * Created for abstract factory pattern
 * @author Annabel
 */
public class LondonOrderXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("London Parsing Order XML...");
        return "London Order XML Parser";
    }
}
