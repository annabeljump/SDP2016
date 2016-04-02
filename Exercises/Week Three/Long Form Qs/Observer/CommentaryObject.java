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
        for (Observer watcher : subList) {
            if (observer.equals(watcher)) {
                subList.remove(observer);
                break;
            }
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : subList){
            observer.update(playByPlay);
        }

    }

    @Override
    public String subjectDetails() {
        return matchDetails;
    }

    @Override
    public void setDesc(String desc) {
        this.playByPlay = desc;
        notifyObservers();
    }
}
