package Question8;

import java.util.Observable;
import java.util.Observer;

/**
 * Question: The Observer pattern supports the MVC pattern.
 * True or False?
 *
 * This answer:
 * @author Annabel Jump
 */

/**
 * True! The Observer pattern can be / is used to notify the controller or the view
 * of changes in the Model (or changes in the view to the controller etc.).
 */

//Example below - Observable class is Question8Observable
    //In this case, cctv would be equivalent to the Controller,
    //and burglar the model.
public class Question8 implements Observer{

    private Question8Observable robber = new Question8Observable("You got me!");

    public Question8(Question8Observable p){
        this.robber = p;
    }

    @Override
    public void update(Observable o, Object arg) {
       System.out.print("Item changed to: " + arg);
    }

    public static void main(String[] args){

        Question8Observable burglar = new Question8Observable("Can I keep my Loot?");

        Question8 cctv = new Question8(burglar);

        burglar.addObserver(cctv);

        burglar.setPerp("It wasn't me!");

    }
}
