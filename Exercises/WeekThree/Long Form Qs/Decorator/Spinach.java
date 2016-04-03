/**
 * Created for pizzaDecorator
 * @author Annabel Jump
 */
public class Spinach extends PizzaDecorator {

    private double cost = 7.92;

    public Spinach(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDesc(){

        return pizzaWithToppings.getDesc() + "Spinach (" + cost + "), ";
    }

    @Override
    public double getPrice(){
        return pizzaWithToppings.getPrice() + cost;
    }
}
