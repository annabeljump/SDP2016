/**
 * Created for Week 3 Long Form Exercises:
 * Factory Method Question
 *
 * @author Annabel Jump
 */
public interface Creator {

    //ConcreteProduct default constructor will return the ConcreteProduct with "Basketball"
        //So if stuff() method called, the sentence will make sense.
    static Product getProduct(){
        return new ConcreteProduct();
    }

}
