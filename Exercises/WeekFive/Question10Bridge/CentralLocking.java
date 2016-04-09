package Question10Bridge;

/**
 * Copied from given code
 * @author not Annabel
 * Modified by
 * @author Annabel
 */
public class CentralLocking implements Product {

    private String name;

    public CentralLocking(String productName) {
        this.name = productName;
    }

    @Override
    public String productName() {
        return name;
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking System");
    }
}
