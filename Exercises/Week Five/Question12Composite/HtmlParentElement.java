package Question12Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created for Composite Design Pattern
 * @author Annabel
 */
public class HtmlParentElement extends HtmlTag {

    private String tag;
    private String start;
    private String end;
    private List<HtmlTag> babies;

    public HtmlParentElement(String s) {
        this.tag = s;
        this.end = "";
        this.start = "";
        this.babies = new ArrayList<HtmlTag>();
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

    @Override
    public void addChildTag(HtmlTag htmlTag) {
        babies.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag) {
        babies.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return babies;
    }

    @Override
    public void generateHtml() {
        System.out.println(start);
        for(HtmlTag child : babies){
            child.generateHtml();
        }
        System.out.println(end);
    }
}
