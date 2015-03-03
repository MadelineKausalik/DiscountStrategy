package discountstrategy;


public class CashRegister {
    private Discount discount;
    private LineItems lineItems;

    public CashRegister(){
        
    }
    
    public CashRegister(Discount discount, LineItems lineItems) {
        this.discount = discount;
        this.lineItems = lineItems;
    }    
    
    public void setLineItems(LineItems lineItems){
        this.lineItems = lineItems;
    }

    public LineItems getLineItems() {
        return lineItems;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
    
    
        
}