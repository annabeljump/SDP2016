/**
 * Created for pizzaDecorator
 * @author Annabel Jump
 */
public class Meat extends PizzaDecorator {

    private double cost = 14.25;

    public Meat(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDesc(){

        return pizzaWithToppings.getDesc() + "Meat (" + cost + "), ";
    }

    @Override
    public double getPrice(){
        return pizzaWithToppings.getPrice() + cost;
    }
}
