package discountstrategy;

public class PercentageDiscount implements Discount {
    
    private double discountRate;
    private int qty;
    private boolean vet = false;
    
    public double getDiscountRate() {
        return discountRate;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
//    public double getPercentDiscount(double price, int qty) {
//        return qty * price * discountRate;
//    }
     @Override
    public double getDiscount(double price, int qty) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PercentageDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public double checkVet(int qty, double price) {
        if (vet == true) {
            return price * 0.5;
        } else {
            return price;
        }
    }
   
}