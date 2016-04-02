/**
 * Long form Question 3: Adapter design pattern
 * @author Annabel Jump
 */
public class XpayToPayDAdapter implements PayD {

    private Xpay fromThis = new XpayImpl();


    @Override
    public String getCustCardNo() {
        return null;
    }

    @Override
    public void setCustCardNo(String custCardNo) {

    }

    @Override
    public String getCardOwnerName() {
        return null;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {

    }

    @Override
    public String getCardExpMonthDate() {
        return null;
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {

    }

    @Override
    public Integer getCVVNo() {
        return null;
    }

    @Override
    public void setCVVNo(Integer cVVNo) {

    }

    @Override
    public Double getTotalAmount() {
        return null;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {

    }
}
