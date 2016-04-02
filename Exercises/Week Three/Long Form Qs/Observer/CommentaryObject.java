import java.util.ArrayList;

/**
 * Created for Observer pattern question
 * @author Annabel Jump
 */
public class CommentaryObject implements Subject {
    private ArrayList<Observer> subList;
    private String matchDetails;

    public CommentaryObject(ArrayList<Observer> list, String str){
        this.subList = list;
        this.matchDetails = str;
    }

    @Override
    public void subscribeObserver(Observer observer) {

    }

    @Override
    public void unSubscribeObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public String subjectDetails() {
        return null;
    }
}
