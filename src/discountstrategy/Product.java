package discountstrategy;

public class Product implements Products {
    
    private String name;
    private double price;
    private String productID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public Product(String name, double price, String productID) {
        this.name = name;
        this.price = price;
        this.productID = productID;
    }
    
    
    
}