/**
 * Created for pizzaDecorator
 * @author Annabel Jump
 */
public class RomaTomatoes extends PizzaDecorator {

    public RomaTomatoes(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDesc(){

        return pizzaWithToppings.getDesc();
    }

    public double getPrice(){
        return pizzaWithToppings.getPrice();
    }


}
