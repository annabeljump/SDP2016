package Question12Composite;

/**
 * Created for Composite Design Pattern
 * @author Annabel
 */
public class HtmlParentElement extends HtmlTag {

    private String tag;

    public HtmlParentElement(String s) {
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
