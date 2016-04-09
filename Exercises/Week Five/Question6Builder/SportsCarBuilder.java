package Question6Builder;

/**
 * Created for Builder design pattern
 * @author annabel
 */
public class SportsCarBuilder implements CarBuilder {

    private Car thisCar = new Car("SPORTSCAR");

    @Override
    public Car getCar() {
        return thisCar;
    }

    @Override
    public void buildBodyStyle() {

    }

    @Override
    public void buildPower() {

    }

    @Override
    public void buildEngine() {

    }

    @Override
    public void buildBrakes() {

    }

    @Override
    public void buildSeats() {

    }

    @Override
    public void buildWindows() {

    }

    @Override
    public void buildFuelType() {

    }
}
