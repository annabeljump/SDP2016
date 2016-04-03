package Question7;

import java.util.Observable;
import java.util.Observer;

/**
 * Question: Using Observable and Observer classes/interfaces show how one
 * object can be informed of updates to another object.
 *
 * This answer:
 * @author Annabel Jump
 */

//This class contains the main method
public class Question7 {

    public static void main(String[] args){

        //Initialise observed object and set the value
        Question7Observable animalFarm = new Question7Observable();
        animalFarm.setOrwell(19.45);

        //Initialise the observer
        Question7Observer pig = new Question7Observer(animalFarm);

        //Make the object observed
        animalFarm.addObserver(pig);

        //Change the Double in the watched item to trigger notification
        animalFarm.setOrwell(19.49);



    }

}
