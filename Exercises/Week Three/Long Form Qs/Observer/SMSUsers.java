/**
 * Created for Observer pattern exercise
 * @author Annabel Jump
 */
public class SMSUsers implements Observer {
    private String name;
    private Subject match;

    public SMSUsers(Subject subject, String str){
        this.match = subject;
        this.name = str;
    }

    @Override
    public void update(String desc) {

    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unSubscribe() {

    }
}
