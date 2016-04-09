package Question10Bridge;

/**
 * Copied from given code
 * @author not Annabel
 * Modified by
 * @author Annabel
 */
public class GearLocking implements Product {

    private String name;

    public GearLocking(String productName) {
        this.name = productName;
    }

    @Override
    public String productName() {
        return name;
    }

    @Override
    public void produce() {
        System.out.println("Producing Gear Locking System");
    }
}
