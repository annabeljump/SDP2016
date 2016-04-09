package Question6Builder;

/**
 * Created for Builder design pattern
 * @author annabel
 */
public interface CarBuilder {

    Car getCar();

    void buildBodyStyle();

    void buildPower();

    void buildEngine();

    void buildBrakes();

    void buildSeats();

    void buildWindows();

    void buildFuelType();

}
