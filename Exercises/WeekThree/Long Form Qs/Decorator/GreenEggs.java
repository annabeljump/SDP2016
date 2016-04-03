/**
 * Created for pizzaDecorator
 * @author Annabel Jump
 */
public class GreenEggs extends PizzaDecorator {

    private double cost = 5.47;

    public GreenEggs(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDesc(){

        return pizzaWithToppings.getDesc() + "Green Eggs (" + cost + ") and ";
    }

    @Override
    public double getPrice(){
        return pizzaWithToppings.getPrice() + cost;
    }

}