/**
 * Difference 3: multiple interfaces can be implemented
 * (and for the sake of it, an abstract class is extended here)
 * @author Annabel Jump
 */
public class AbstractInterfaceImpl1 extends SecondAbstract implements ExampleInterface, SecondInterface {

    @Override
    public void doSomeStuff(){
        //Stuff goes here
    }

    @Override
    public void doThings(){
        //Things go here
    }

    @Override
    public String doEvenMoreStuff(){
        //Even More Stuff here
        String hi = "hello";
        return hi;
    }
}
