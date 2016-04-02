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
        System.out.println(name + ", New Match Update for " + match.subjectDetails() + ": " + desc);
    }

    @Override
    public void subscribe() {
        Observer user = new SMSUsers(this.match, this.name);
        match.subscribeObserver(user);
    }

    @Override
    public void unSubscribe() {
        Observer user = new SMSUsers(this.match, this.name);
        match.unSubscribeObserver(user);
    }

    @Override
    public Boolean equals(Observer o){
        if(o.getName() == this.name){
            return true;
        } else return false;
    }

    @Override
    public String getName(){
        return this.name;
    }
}
