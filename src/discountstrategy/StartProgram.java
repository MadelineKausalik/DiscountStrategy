package discountstrategy;

public class StartProgram {

    public static void main(String[] args) {
        
        LineItems one = new LineItems(Product.mtnDewVoltage,3);
        
        Discount.mtn12Pack(Product.mtnDewVoltage);
        
        System.out.println(Product.mtnDewVoltage.getPrice());
        
        
        
    }
    
}