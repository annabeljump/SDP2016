/**
 * Created for decorator pattern
 * @author Annabel Jump
 */
public class SimplyVegPizza implements Pizza {

    private double cost = 230;
    private String description = "SimplyVegPizza (" + cost + "), ";

    @Override
    public String getDesc() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.cost;
    }
}
