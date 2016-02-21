package Question7;

import javafx.beans.value.ObservableValue;
import java.util.Observable;
import java.util.Observer;

/**
 * Observer class for Question 7
 * @author Annabel Jump
 */
public class Question7Observer implements Observer{

    //Initialise value that is being observed
    private ObservableValue george = null;

    //Constructor for Question7Observer
    public Question7Observer(ObservableValue b){
        this.george = b;
    }

    //Method from interface Observer - checks object from which notification received
    //is the object being observed, if so gets the new value and prints it.
    @Override
    public void update(Observable o, Object arg) {
        if (george == o){
            System.out.print(george.getValue());
        }
    }
}
