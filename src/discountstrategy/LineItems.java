package discountstrategy;

public class LineItems {
    private Discount discount;
    private Product product;
    private int qty;

    private Discount discounts[] = {
        new QtyDiscount(3),
        new PercentageDiscount(.5)
    };
    
    public Product getProduct() {
        return product;
    }

    public Discount getDiscount() {
        return discount;
    }

    public final void setDiscount(Discount discount) {
        if(discount == null){
            return;
        }
        this.discount = discount;
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

    public LineItems(Product product, int qty, Discount discount) {
        this.product = product;
        this.qty = qty;
        setDiscount(discount);// should use setter methods for this
    }
// Add database to this class
    @Override
    public String toString() {
        double total = 0;
                if(getDiscount() == discounts[0]){
                    total = product.getPrice() * qty - product.getPrice();
                }else{
                    total = product.getPrice() * qty;
                }
        return "Total: " + total;
    }
    
    

}