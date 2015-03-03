package discountstrategy;

public class QtyDiscount implements Discount {
    
    private double discountRate = 0.1;
    private int qty;
    private int minQty;

    public QtyDiscount(int minQty) {
        this.minQty = minQty;
    }
    
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

    @Override
    public double getDiscount(double price, int qty) {
         double totalPrice = 0;
        if (qty >= minQty) {
            totalPrice = (price * qty) - price;
        } else {
           totalPrice = (price * qty);
        }
         return totalPrice;
    }
    
    
}