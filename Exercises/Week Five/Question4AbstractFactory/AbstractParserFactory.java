package Question4AbstractFactory;

/**
 * Copied from exercise sheet
 * @author not annabel
 */
public interface AbstractParserFactory {
    public XMLParser getParserInstance(String parserType);
}