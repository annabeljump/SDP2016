/**
 * Created for Decorator pattern exercise
 * @author Annabel Jump
 */
public abstract class PizzaDecorator implements Pizza {

    String topping;
    protected Pizza pizzaWithToppings;

    //Not really sure these methods are correct

    public PizzaDecorator(Pizza decoratedPizza){
        this.pizzaWithToppings = decoratedPizza;
    }

    public String getDesc(){
        String topped = pizzaWithToppings.getDesc() + topping;
        return topped;
    }

    public double getPrice(){
        return pizzaWithToppings.getPrice();
    }

}
