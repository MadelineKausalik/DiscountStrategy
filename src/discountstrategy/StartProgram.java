package discountstrategy;

public class StartProgram {



 
    public static void main(String[] args) {
        Database db = new Database();        
        Product[] products = db.getProducts();
        Discount[] discount = db.getDiscounts();
//        LineItems item = new LineItems(products[0], 3);
//        
//        
//        discount[0].getDiscount(3, 3);
//        
//        System.out.println(new LineItems(products[0],3));
        
        
        CashRegister service = new CashRegister();
        service.setLineItems(new LineItems(products[0],3, discount[0]));
        
        System.out.println("================================");
        for(customers[i]) {
            
        }
        System.out.println("================================");
        System.out.println(service.getLineItems().toString());
        
    }
    
}