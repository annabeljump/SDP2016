package Question4AbstractFactory;

/**
 * Created for abstract factory pattern
 * @author Annabel
 */
public class NYCFeedbackXML implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NYC Parsing Feedback XML...");
        return "NYC Feedback XML Parser";
    }
}
