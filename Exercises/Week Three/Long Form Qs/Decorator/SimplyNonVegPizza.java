/**
 * Created for decorator pattern
 * @author Annabel Jump
 */
public class SimplyNonVegPizza implements Pizza {

    private double cost = 350;
    private String description = "SimplyNonVegPizza (" + cost + "), ";

    @Override
    public String getDesc() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.cost;
    }
}
