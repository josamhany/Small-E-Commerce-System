import javax.swing.*;

public class Customer {
    private int CustomerID;
    private String name,address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
