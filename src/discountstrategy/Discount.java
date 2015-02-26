package discountstrategy;

public interface Discount {
    Discount mtn12Pack = new QtyDiscount(.20, 3);
    Discount vDaySocks = new PercentageDiscount(.50);
}