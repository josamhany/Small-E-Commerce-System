
public class Product {
    private int productID;
    private String name;
    private double price;
    Product []products;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getProductID() {
        return productID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}