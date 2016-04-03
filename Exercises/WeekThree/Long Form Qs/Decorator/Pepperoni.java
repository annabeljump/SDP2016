/**
 * Created for pizzaDecorator - couldn't miss my favourite pizza topping
 * @author Annabel Jump
 */
public class Pepperoni extends PizzaDecorator {

    private double cost = 2.50;

    public Pepperoni(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDesc(){

        return pizzaWithToppings.getDesc() + "Pepperoni (" + cost + "), ";
    }

    @Override
    public double getPrice(){
        return pizzaWithToppings.getPrice() + cost;
    }
}
