/**
 * Created for pizzaDecorator
 * @author Annabel Jump
 */

public class Ham extends PizzaDecorator {

    private double cost =  18.12;

    public Ham(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDesc(){

        return pizzaWithToppings.getDesc() + "Ham (" + cost + "), ";
    }

    @Override
    public double getPrice(){
        return pizzaWithToppings.getPrice() + cost;
    }
}
