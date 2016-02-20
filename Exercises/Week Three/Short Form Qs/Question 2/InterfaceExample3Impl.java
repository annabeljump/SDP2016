/**
 * Interface for demonstration of true/false questions:
 * Question c) constructors taking specific fields must be declared in impl
 *  @author Annbel Jump
 */

//The constructors are accepted here. I have added an extra constructor, taking both int and String
//The attempted constructors in the interface are borking this implementation.

public class InterfaceExample3Impl implements InterfaceExample3 {
    String demoString = null;
    int demoInt = 0;

    public InterfaceExample3Impl(String s){
        this.demoString = s;
    }

    public InterfaceExample3Impl(int x){
        this.demoInt = x;
    }

    public InterfaceExample3Impl(){
        return;
    }

    public InterfaceExample3Impl(String s, int x){
        this.demoString = s;
        this.demoInt = x;
    }

    @Override
    public void doStuff(){
        //Stuff
    }
}
