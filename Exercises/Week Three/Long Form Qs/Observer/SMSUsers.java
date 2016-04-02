/**
 * Created for Observer pattern exercise
 * @author Annabel Jump
 */
public class SMSUsers implements Observer {
    private String name;
    private Subject match;

    private Observer user = new SMSUsers(match, name);

    public SMSUsers(Subject subject, String str){
        this.match = subject;
        this.name = str;
    }

    @Override
    public void update(String desc) {
        System.out.println(name + ", New Match Update for " + match.subjectDetails() + ": /n" + desc);
    }

    @Override
    public void subscribe() {
        match.subscribeObserver(user);
    }

    @Override
    public void unSubscribe() {
        match.unSubscribeObserver(user);
    }
}
