/**
 * Created in answer to Week 2 Singleton Long Form Question
 * To demonstrate Double-checked locking on the Singleton
 * @author Annabel Jump
 */

public class DoubleCheckedSingleton {

    private DoubleCheckedSingleton(){}

    public static DoubleCheckedSingleton getInstance(){
        //First check
        if(object == null)
            //Second check - synchronized only called once and only if necessary
            synchronized (DoubleCheckedSingleton.class) {
                if (object == null){
                    object = new DoubleCheckedSingleton();
                }
            }
        return object;
    }

    //Must be volatile or other threads can see partially created instances
    private volatile static DoubleCheckedSingleton object;
}