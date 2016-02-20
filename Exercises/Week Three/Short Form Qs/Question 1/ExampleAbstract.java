/**
 * Example Abstract Class for Question 1
 * @author Annabel Jump
 */

public abstract class ExampleAbstract {
    //A field that is neither static nor final
    int demoInt;

    //A field that is not public (actually, demoInt is package local,
    //but here's a specific example)
    private String hello;

    abstract void doStuff();

}