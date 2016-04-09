package Question6Builder;

/**
 * Created for Builder design pattern
 * @author annabel
 */
public class CarDirector {

    private CarBuilder myCar;

    public CarDirector(CarBuilder cB) {
        this.myCar = cB;
    }

    public void build() {
        myCar.buildBodyStyle();
        myCar.buildBrakes();
        myCar.buildEngine();
        myCar.buildFuelType();
        myCar.buildPower();
        myCar.buildSeats();
        myCar.buildWindows();
    }
}
