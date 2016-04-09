package Question6Builder;

/**
 * Created for Builder design pattern
 * @author annabel
 */
public class SedanCarBuilder implements CarBuilder {

    private Car thisCar = new Car("SEDAN");

    @Override
    public Car getCar() {
        return thisCar;
    }

    @Override
    public void buildBodyStyle() {
        thisCar.setBodyStyle("External dimensions: overall length (inches): 202.9,\n" +
                "overall width (inches): 76.2, overall height (inches): 60.7,\n" +
                "wheelbase (inches): 112.9, front track (inches): 65.3,\n" +
                "rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5");
    }

    @Override
    public void buildPower() {
        thisCar.setPower("285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm");
    }

    @Override
    public void buildEngine() {
        thisCar.setEngine("3.5L Duramax V 6 DOHC");
    }

    @Override
    public void buildBrakes() {
        thisCar.setBrakes("Four-wheel disc brakes: two ventilated. Electronic brake distribution");
    }

    @Override
    public void buildSeats() {
        thisCar.setSeats("Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats");
    }

    @Override
    public void buildWindows() {
        thisCar.setWindows("Laminated side windows.Fixed rear window with defroster");
    }

    @Override
    public void buildFuelType() {
        thisCar.setFuelType("Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range");
    }
}
