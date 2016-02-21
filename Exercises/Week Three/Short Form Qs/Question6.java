/**
 * Question: Why might you decide to lazy-initialise a singleton instance rather
 * than initialise it in its field declaration? Provide examples of both.
 */

/**
 * This Answer:
 * @author Annabel Jump
 *
 * Lazy-initialisation means that the object is only created on its first use,
 * so if the object is not needed, it is not needlessly created.
 */

//This class contains lazy-initialisation of a singleton
    //Please see my answer to Short Form Q5 for the instance of a singleton
    //initialised in its field declaration.
public class Question6 {

    private Question6(){}

    //As in Q5, getInstance() should be synchronized so that threads only return same instance
    public static synchronized Question6 getInstance(){
        if(object == null)
            object = new Question6();
        return object;
    }

    private static Question6 object;
}