package Question10Bridge;

/**
 * Copied from given code
 * @author not Annabel
 * Modified by
 * @author Annabel
 */
public abstract class Car {

    private Product p;
    private String type;

    public Car(Product product, String carType) {
        this.p = product;
        this.type = carType;
    }

    public abstract void assemble();

    public abstract void produceProduct();

    public void printDetails() {
        System.out.println("Car: " + type + ", Product: " + p.productName());
    }
}
