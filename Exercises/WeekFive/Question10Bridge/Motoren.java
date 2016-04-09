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
        System.out.println("Assembling " + p.productName() + " for " + type);
    }

    @Override
    public void produceProduct() {
        System.out.println("Modifying " + p.productName() + " according to "
                + type + "'s specifications");
    }
}
