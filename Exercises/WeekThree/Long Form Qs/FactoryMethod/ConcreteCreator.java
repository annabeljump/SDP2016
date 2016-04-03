/**
 * Created for Week 3 Long Form Exercises:
 * Factory Method Question
 *
 * @author Annabel Jump
 */
public class ConcreteCreator implements Creator {

    public Product getProduct(){
        return Creator.getProduct();
    }
}
