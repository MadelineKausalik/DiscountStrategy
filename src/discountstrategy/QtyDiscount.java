package discountstrategy;

public class QtyDiscount implements Discount {
    
    private double discountRate = 0.1;
    private int qty;
    private int minQty;

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

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }
    
    public QtyDiscount(double discountRate, int minQty) {
        this.discountRate = discountRate;
        this.minQty = minQty;
    }
    
    public double checkDiscount(int qty, double price) {
        if (qty >= minQty) {
            return price = 3.00;
        } else {
            return price = price;
        }
    }
    
}