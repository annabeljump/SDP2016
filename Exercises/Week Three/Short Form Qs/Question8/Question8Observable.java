package Question8;

import java.util.Observable;

/**
 * Observable Class for Short Form question 8
 * @author Annabel Jump
 */
public class Question8Observable extends Observable {
    private String caught;

    public Question8Observable(String perp) {
        caught = perp;
    }

    public void setPerp(String criminal) {
        this.caught = criminal;

        setChanged();
        notifyObservers();
        }

    public String getPerp(){
        return caught;
    }

    }