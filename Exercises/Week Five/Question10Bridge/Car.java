package Question10Bridge;

/**
 * Copied from given code
 * @author not Annabel
 */
public abstract class Car {

    public Car(Product product, String carType) {
        throw new UnsupportedOperationException();
    }

    public abstract void assemble();

    public abstract void produceProduct();

    public void printDetails() {
        throw new UnsupportedOperationException();
    }
}
