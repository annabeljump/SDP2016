/**
 * Copied from Exercise sheet
 * @author not Annabel
 */

public interface Observer {

    void update(String desc);

    void subscribe();

    void unSubscribe();

    //these are now unnecessary but will leave them
    Boolean equals(Observer o);

    String getName();

}
