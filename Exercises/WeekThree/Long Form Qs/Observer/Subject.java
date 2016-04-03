/**
 * Copied from exercise sheet
 * @author not Annabel
 */

public interface Subject {

    void subscribeObserver(Observer observer);

    void unSubscribeObserver(Observer observer);

    void notifyObservers();

    String subjectDetails();

}
