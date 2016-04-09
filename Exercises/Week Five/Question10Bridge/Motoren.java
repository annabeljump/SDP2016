package Question10Bridge;

/**
 * Copied from given code
 * @author not Annabel
 * Modified by
 * @author Annabel
 */
public class Motoren extends Car {

    private Product p;
    private String type;

    public Motoren(Product product, String carType) {
        super(product,carType);
        this.p = product;
        this.type = carType;
    }

    @Override
    public void assemble() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void produceProduct() {
        throw new UnsupportedOperationException();
    }
}
