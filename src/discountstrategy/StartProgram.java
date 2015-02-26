package discountstrategy;

public class StartProgram {

    public static void main(String[] args) {
        
        Product p = new Product("Women's Socks", 12.95, "12345");
//        QtyDiscount d = new QtyDiscount(0.3, 3);
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        System.out.println(p.getProductID());
        
    }
    
}