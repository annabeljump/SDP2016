/**
 * Created for Week 3 Long Form Question 1
 * Factory Method - main method to show factory works
 * @author Annabel Jump
 */

public class mainProductFactory {
    public static void main(String[] args){

        //make a Creator
        ConcreteCreator game = new ConcreteCreator();

        //make a new ConcreteProduct using the Creator
        Product ball = game.getProduct();

        //now call stuff() to check output
        ball.stuff();
    }
}
