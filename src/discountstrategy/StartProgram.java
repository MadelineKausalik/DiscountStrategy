package discountstrategy;

public class StartProgram {



 
    public static void main(String[] args) throws Exception {
        Database db = new Database();        
        Product[] products = db.getProducts();
        Discount[] discount = db.getDiscounts();
//        LineItems item = new LineItems(products[0], 3);
//        
//        
//        discount[0].getDiscount(3, 3);
//        
//        System.out.println(new LineItems(products[0],3));
        
        /* this doesn't do anything right now because the whole program is broken
        What I was trying to do was to catch if a product scans as null
        I tried to make this as basic as possible even though it doesn't do anything
        I'm not sure what else to do besides this
        */
        try { 
        if (products == null) {
            System.out.println("Product did not scan! Please try again.");
        }
        } catch (IllegalAccessException) {
            throw CashRegister();
        } finally {
            
        }
            
        
        CashRegister service = new CashRegister();
        service.setLineItems(new LineItems(products[0],3, discount[0]));
        
        System.out.println("================================");
        for(customers[i]) {
            
        }
        System.out.println("================================");
        System.out.println(service.getLineItems().toString());
        
    }
    
}