/**
 * Long form Question 3: Adapter design pattern
 * @author Annabel Jump
 */
public class XpayToPayDAdapter implements PayD {

    private Xpay fromThis = new XpayImpl();

    //Xpay fields remaining to convert/set:
    //private String cardExpMonth;
    //private String cardExpYear;


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
