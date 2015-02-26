package discountstrategy;

public interface Discount {
    Discount mtn12Pack = new QtyDiscount(.40, 3);
    Discount vDaySocks = new PercentageDiscount(.50);
}