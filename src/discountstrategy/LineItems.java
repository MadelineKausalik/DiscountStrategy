package discountstrategy;

public class LineItems {
    private Product product;
    private int qty;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public LineItems(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }
    
    
    
}
