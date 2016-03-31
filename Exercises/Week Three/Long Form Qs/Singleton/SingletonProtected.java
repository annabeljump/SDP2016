import java.io.Serializable;

/**
 * Created for Singleton Long Form Question from Week 3
 * Attempt at non-borking Singleton
 * if possible
 * @author Annabel Jump
 */

/**
 * Regarding reflection: an ENUM could be used - each enum case can only be instantiated once
 * But, as this does not allow for lazy initialisation
 * I have not implemented it here, but have demonstrated in long comment below:
 */

/*
 * public enum SingleEnum {
 *      INSTANCE;
 * }
 */


//simple way for Cloneable not to break the Singleton = don't implement Cloneable
    //singletons and cloneable objects are pretty much exact opposites
    //but if you really wanted to implement Cloneable, could override clone() to throw an exception
public class SingletonProtected implements Serializable {

    //to avoid multiple class loaders, specify class loader to be used
        //NB: This code is from StackOverflow and originally from JavaWorld blog!
        //can't see how else to do it, so here's the link in the next line, all credit to them:
        //@author http://www.javaworld.com/article/2073352/core-java/simply-singleton.html?page=2
    private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if(classLoader == null)
            classLoader = SingletonProtected.class.getClassLoader();
        return (classLoader.loadClass(classname));
    }

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
