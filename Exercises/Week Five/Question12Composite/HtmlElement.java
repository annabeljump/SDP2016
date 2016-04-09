package Question12Composite;

/**
 * Created for Composite Design Pattern
 * @author Annabel
 */
public class HtmlElement extends HtmlTag {

    private String tag;
    private String start;
    private String end;
    private String body;

    public HtmlElement(String s) {
        this.tag = s;
    }

    @Override
    public String getTagName() {
        return tag;
    }

    @Override
    public void setStartTag(String tag) {
        this.start = tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.end = tag;
    }

    public void setTagBody(String bodyodyody) {
        this.body = bodyodyody;
    }

    @Override
    public void generateHtml() {
        System.out.println(start + " " + body + " " + end);
    }
}
