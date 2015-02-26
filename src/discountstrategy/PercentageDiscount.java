package discountstrategy;

public class PercentageDiscount implements Discount {
    
    private double discountRate;
    private int qty;
    
    public double getDiscountRate() {
        return discountRate;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public double getPercentDiscount(double price, int qty) {
        return qty * price * discountRate;
    }

    public PercentageDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
}