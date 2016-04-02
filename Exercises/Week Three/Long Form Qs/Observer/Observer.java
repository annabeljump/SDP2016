/**
 * Copied from Exercise sheet
 * @author not Annabel
 */

public interface Observer {

    void update(String desc);

    void subscribe();

    void unSubscribe();

    Boolean equals(Observer o);

    String getName();

}
