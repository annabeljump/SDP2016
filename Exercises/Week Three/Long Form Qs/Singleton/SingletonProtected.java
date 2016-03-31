import java.io.Serializable;

/**
 * Created for Singleton Long Form Question from Week 3
 * Attempt at non-borking Singleton
 * if possible
 * @author Annabel Jump
 */

public class SingletonProtected implements Serializable {

    private static final long serialVersionID = 68L;

    private SingletonProtected(){}

    //this prevents multiple instances being generated in the Serializable case
    protected Object readResolve() {
        return getInstance();
    }

    public static SingletonProtected getInstance(){
        //First check
        if(object == null)
            //Second check - synchronized only called once and only if necessary
            synchronized (SingletonProtected.class) {
                if (object == null){
                    object = new SingletonProtected();
                }
            }
        return object;
    }

    //Must be volatile or other threads can see partially created instances
    private volatile static SingletonProtected object;

}