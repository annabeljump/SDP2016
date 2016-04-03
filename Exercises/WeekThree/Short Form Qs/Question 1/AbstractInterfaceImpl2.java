/**
 * Difference 3: only one Abstract class can be extended
 * @author Annabel Jump
 */

//This will not compile, as am attempting to extend two abstract classes
public class AbstractInterfaceImpl2 extends ExampleAbstract, SecondAbstract{

    @Override
    public void doStuff(){
        //Stuff would go here
    }

    @Override
    public String doEvenMoreStuff(){
        //Even more stuff here
        String hi = "hello";
        return hi;
    }
}
