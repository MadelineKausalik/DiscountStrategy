package discountstrategy;

public class LineItems {
    private Discount discount;
    private Product product;
    private int qty;

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
                if(getDiscount() == discount[0]){
                    total = 
                }else{
                    
                }
        return "";
    }

}