package Question7;

import java.util.Observable;

/**
 * Observable Objects for Question 7.
 * @author Annabel Jump
 */
public class Question7Observable extends Observable {

    private Double orwell = 19.84;

    //Initialise the value
    public void Question7Observable(Double o){
        this.orwell = o;
    }

    //Method to change the value
    public void setOrwell(Double g){
        this.orwell = g;
        //Mark that the value has been changed and notify observers
        setChanged();
        notifyObservers();
    }

    //Method to return the (changed) value
    public double getValue(){
        return orwell;
    }
}
