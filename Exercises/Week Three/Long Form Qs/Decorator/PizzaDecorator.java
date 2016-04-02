/**
 * Created for Decorator pattern exercise
 * @author Annabel Jump
 */
public abstract class PizzaDecorator implements Pizza {

    protected Pizza pizzaWithToppings;

    //Not really sure these methods are correct

    public PizzaDecorator(Pizza decoratedPizza){
        this.pizzaWithToppings = decoratedPizza;
    }

    public String getDesc(){
        return pizzaWithToppings.getDesc();
    }

    public double getPrice(){
        return pizzaWithToppings.getPrice();
    }

}
