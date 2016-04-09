package Question2Strategy;

/**
 * Created for Strategy Pattern Q2.
 * @author Annabel Jump
 */
public class CapTextFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return "[CapTextFormatter]: " + text.toUpperCase();
    }
}
