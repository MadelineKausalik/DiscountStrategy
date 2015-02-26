package discountstrategy;

public class PercentageDiscount implements Discount {
    
    private double discountRate = 0.1;
    private int qty;
    
    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
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
    
}