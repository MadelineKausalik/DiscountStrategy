package discountstrategy;


public class Customers {
    
    private String lastName;
    private String firstName;
    private String cusID;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCusID() {
        return cusID;
    }

    public void setCusID(String cusID) {
        this.cusID = cusID;
    }

    public Customers(String lastName, String firstName, String cusID) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.cusID = cusID;
    }
    
    
    
}
