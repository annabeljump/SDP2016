/**
 * Question: How can you prevent other developers from constructing new instances of your class?
 * Provide appropriate examples to illustrate answer.
 *
 * This answer:
 * @author Annabel Jump
 */

/**
 * Using the Design Pattern of the Singleton class would achieve this.
 * Example as follows:
 */

public class Question5 {

    //Initialise an object of the class - both private and
        //This is not visible outside the class
    private static Question5 object = new Question5();

    //The constructor must be private so as not accessible outside the class itself
    private Question5(){}

    //Method to be called outside of class to initialise an instance of the class
        //Should be synchronized so that multiple threads do not create multiple instances
    public static synchronized Question5 getInstance(){
        return object;
    }

}