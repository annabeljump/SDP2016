/**
 * Created for Week 3 Long Form Exercises:
 * Factory Method Question
 *
 * @author Annabel Jump
 */

public class ConcreteProduct implements Product {

    private String magic = "Orlando";

    public ConcreteProduct() {
        this("Basketball");
    }

    public ConcreteProduct(String m){
        this.magic = m;
    }

    @Override
    public void stuff() {
        System.out.println("Stuff the Magic Dragon is a " + magic + "  Team's Mascot");
    }
}
