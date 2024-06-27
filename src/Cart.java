import java.util.Scanner;

public class Cart {
    Customer c;
    Product P;
    Product[] products = new Product[getnProducts()];
    public Cart(Customer c){
        this.c=c;
    }
    private int nProducts;

    public int getCustomerID() {
        return c.getCustomerID();
    }

    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
        products = new Product[nProducts];
    }


    public int getnProducts() {
        return nProducts;
    }

    public void addProduct(Product p, int j){
        products[j]=p;
    }
    public void removeProduct(int p){
        System.out.println("Product ID "+ (products[p-1].getProductID())+" Removed");
        products[p-1] = new Product();
    }

    public float CalculatePrice(){
        float total=0;
        for (int j = 0; j < nProducts; j++) {
            total+= products[j].getPrice();
        }
        return total;
    }
    public void PlaceOrder(int n){
        Order order = new Order(this);

        if(n==1){
            System.out.println("Here's your order's Summary: ");
           
            order.printOrderInfo(); 
        }
        else{
            System.out.println("if you want to remove products press 1 or exit press 0:");
             Scanner in = new Scanner(System.in);
             n = in.nextInt();
             if(n==0){
                System.out.println("Thank You.....");
             }
             else{
                int Exit = 1;
                while (Exit==1 || nProducts==0) {
                    
                    if(nProducts==0){
                        System.out.println("No more Products to remove");
                    }
                    else{
                        System.out.println("Enter the product number you want to remove : ");
                        removeProduct(in.nextInt());
                        System.out.println("if you want to remove more products press 1 else press 0:  ");
                        Exit = in.nextInt();
                        nProducts--;
                        if (Exit == 0) {
                            order.printOrderInfo();  
                        }
                    }
                   
                }

                
             }
        }
    }
}
