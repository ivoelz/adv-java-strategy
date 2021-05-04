package discount;

public class SaleDiscount implements DiscountStrategy {

    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * 0.1);
    }
}
