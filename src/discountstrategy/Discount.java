package discountstrategy;

public interface Discount {
//    Discount mtn12Pack = new QtyDiscount(.40, 3);
//    Discount vDaySocks = new PercentageDiscount(.50);
    public abstract double getDiscount(double price, int qty);
    
}



// Cashregister only have database and lineitem objects but first test until you get LineItem output correct. 
//
//
//