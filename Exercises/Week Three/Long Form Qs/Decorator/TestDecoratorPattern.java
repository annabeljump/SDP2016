import java.text.DecimalFormat;

/**
 * Copied from the exercise sheet
 * Because who DOESN'T like pizza??
 * @author not Annabel
 */

public class TestDecoratorPattern {

    private static DecimalFormat dformat;

    static {
        dformat = new DecimalFormat("#.##");
    }

    public static void main(String[] args) {

        Pizza pizza = new SimplyVegPizza();

        /*
         * Because "Print" is called after every ingredient, the output (apart from after the final ingredient)
         * does not look like the one in the exercise sheet! Also the exercise sheet output has two "Cheese"
         * where only one "cheese" has been added to the nonVegPizza.
         */
        pizza = new RomaTomatoes(pizza);
        print(pizza);

        pizza = new GreenOlives(pizza);
        print(pizza);

        pizza = new Spinach(pizza);
        print(pizza);

        pizza = new SimplyNonVegPizza();
        print(pizza);

        pizza = new Meat(pizza);
        print(pizza);

        pizza = new Cheese(pizza);
        print(pizza);

        pizza = new Ham(pizza);
        print(pizza);

        //Here are some extra tests to prove comment above:

        Pizza myFavourite = new SimplyNonVegPizza();

        myFavourite = new Cheese(myFavourite);
        myFavourite = new Pepperoni(myFavourite);
        myFavourite = new Pepperoni(myFavourite);
        print(myFavourite); //Cheese and double pepperoni!

        //One More, because now I am hungry:


    }

    private static void print(Pizza pizza) {
        System.out.println("Desc: " + pizza.getDesc());
        System.out.println("Price: " + dformat.format(pizza.getPrice()));
    }
}