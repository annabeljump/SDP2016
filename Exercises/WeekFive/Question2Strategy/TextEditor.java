package Question2Strategy;

/**
 * Created for Strategy Pattern Q2.
 * @author Annabel Jump
 */
public class TextEditor {

    private TextFormatter f;

    public TextEditor(TextFormatter tf){
        this.f = tf;
    }

    public String publishText(String x){
        String y = f.format(x);
        System.out.println(y);
        return y;
    }
}
