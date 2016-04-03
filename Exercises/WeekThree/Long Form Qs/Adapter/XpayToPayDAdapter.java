/**
 * Long form Question 3: Adapter design pattern
 * @author Annabel Jump
 */
public class XpayToPayDAdapter implements PayD {

    private Xpay fromThis = new XpayImpl();

    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;

    public Xpay toThis(PayD allDetails){
        fromThis.setAmount(this.totalAmount);
        fromThis.setCreditCardNo(this.custCardNo);
        fromThis.setCustomerName(this.cardOwnerName);
        fromThis.setCardCVVNo(this.cVVNo.shortValue());
        //this assumes credit card expiry dates will be "MM/YY" or "MM/YYY"
        String[] expiryData = this.cardExpMonthDate.split("/");
        String expMonth = expiryData[0];
        String expYear = expiryData[1];
        fromThis.setCardExpMonth(expMonth);
        fromThis.setCardExpYear(expYear);
        return fromThis;
    }

    @Override
    public String getCustCardNo() {
        return this.custCardNo;
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return this.cardOwnerName;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public String getCardExpMonthDate() {
        return cardExpMonthDate;
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }

    @Override
    public Integer getCVVNo() {
        return this.cVVNo;
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        this.cVVNo = cVVNo;
    }

    @Override
    public Double getTotalAmount() {
        return this.totalAmount;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
