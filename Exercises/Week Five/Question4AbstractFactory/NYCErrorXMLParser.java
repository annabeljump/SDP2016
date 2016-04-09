package Question4AbstractFactory;

/**
 * Created for abstract factory pattern
 * @author Annabel
 */
public class NYCErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NYC Parsing Error XML...");
        return "NYC Error XML Parser";
    }
}
