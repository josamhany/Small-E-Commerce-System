import java.util.ArrayList;

public class Order {
Cart c;
    public Order(Cart c) {
        this.c = c;
    }
static int orderID=1;
 public void printOrderInfo(){
     System.out.println("Customer ID: "+ c.getCustomerID());
     System.out.println("Order ID: "+orderID);
     orderID++;
     System.out.println("Products is: ");
     for (int i = 0; i < c.products.length; i++) {
        if(c.products[i]!= null){
            
         System.out.println("Product "+(i+1)+ " ID: "+ c.products[i].getProductID());
         System.out.println("Product Name: "+ c.products[i].getName());
         System.out.println("Product Price : "+ c.products[i].getPrice()+" $");
        }
    }
     System.out.println("TOTAL PRICE = "+c.CalculatePrice()+" $");
 }


}
