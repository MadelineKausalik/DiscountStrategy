package discountstrategy;


public class Database {
    
    private Product[] products = {
        new Product("Mtn Dew", 5.50, "A81E2"),
        new Product("Men's Socks", 2.99, "B32DF")
    };
        
    public Product[] getProducts() {
        return products;
    }
    
    private final Discount discounts[] = {
        new QtyDiscount(3),
        new PercentageDiscount(.5)
    };
    
    public Discount[] getDiscounts() {
        return discounts;
    }
    
    private Customers[] customers = {
      new Customers("Smith", "John", "45612638"),
      new Customers("Brown", "Molly", "97123788")
    };

    public Customers[] getCustomers() {
        return customers;
    }
    
    
    
}