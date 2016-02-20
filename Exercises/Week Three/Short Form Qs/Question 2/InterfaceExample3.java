/**
 * Interface for demonstration of true/false questions:
 * Question c) constructors taking specific fields must be declared in impl
 *  @author Annbel Jump
 */

//Constructors not accepted, see InterfaceExample3Impl

public interface InterfaceExample3 {
    String demoString = null;
    int demoInt = 0;

    public InterfaceExample3(String s);

    public InterfaceExample3(int x);

    public InterfaceExample3();

    void doStuff();
}