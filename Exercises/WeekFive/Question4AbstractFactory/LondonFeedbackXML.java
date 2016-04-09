package Question4AbstractFactory;

/**
 * Created for abstract factory pattern
 * @author Annabel
 */
public class LondonFeedbackXML implements XMLParser{
    @Override
    public String parse() {
        System.out.println("London Parsing Feedback XML...");
        return "London Feedback XML Parser";
    }
}
