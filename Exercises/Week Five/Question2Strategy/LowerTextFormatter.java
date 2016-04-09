package Question2Strategy;

/**
 * Created for Strategy Pattern Q2.
 * @author Annabel Jump
 */
public class LowerTextFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return "[LowerTextFormatter]: " + text.toLowerCase();
    }
}
