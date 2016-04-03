/**
 * Created for pizzaDecorator
 * @author Annabel Jump
 */

public class Cheese extends PizzaDecorator {

    private double cost = 20.72;

    public Cheese(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDesc(){

        return pizzaWithToppings.getDesc() + "Cheese (" + cost + "), ";
    }

    @Override
    public double getPrice(){
        return pizzaWithToppings.getPrice() + cost;
    }
}