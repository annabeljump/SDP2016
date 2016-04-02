import java.util.ArrayList;

/**
 * Created for Observer pattern question
 * @author Annabel Jump
 */
public class CommentaryObject implements Subject, Commentary {
    private ArrayList<Observer> subList;
    private String matchDetails;
    private String playByPlay;

    public CommentaryObject(ArrayList<Observer> list, String str){
        this.subList = list;
        this.matchDetails = str;
    }

    @Override
    public void subscribeObserver(Observer observer) {
        subList.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {

        //need to test to see if removes the correct observer - may need to use .equals
        subList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : subList){
            observer.update(playByPlay);
        }

    }

    //not entirely sure what this method is at this point. This is a guess.
    @Override
    public String subjectDetails() {
        return matchDetails;
    }

    @Override
    public void setDesc(String desc) {
        this.playByPlay = desc;
    }
}
