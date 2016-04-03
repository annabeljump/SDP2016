/**
 * Created for pizzaDecorator
 * @author Annabel Jump
 */
public class GreenOlives extends PizzaDecorator {

    private double cost = 5.47;

    public GreenOlives(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDesc(){

        return pizzaWithToppings.getDesc() + "Green Olives (" + cost + "), ";
    }

    @Override
    public double getPrice(){
        return pizzaWithToppings.getPrice() + cost;
    }

}
