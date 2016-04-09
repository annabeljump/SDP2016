package Question12Composite;

/**
 * Created for Composite Design Pattern
 * @author Annabel
 */
public class HtmlElement extends HtmlTag {

    private String tag;

    public HtmlElement(String s) {
        this.tag = s;
    }

    @Override
    public String getTagName() {
        return null;
    }

    @Override
    public void setStartTag(String tag) {

    }

    @Override
    public void setEndTag(String tag) {

    }

    @Override
    public void generateHtml() {

    }
}
