/**
 * Created for pizzaDecorator
 * @author Annabel Jump
 */
public class RomaTomatoes extends PizzaDecorator {

    private double cost =  5.20;

    public RomaTomatoes(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDesc(){

        return pizzaWithToppings.getDesc() + "Roma Tomatoes (" + cost + "), ";
    }

    @Override
    public double getPrice(){
        return pizzaWithToppings.getPrice() + cost;
    }


}
