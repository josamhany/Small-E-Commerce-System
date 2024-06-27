import java.util.Scanner;

public class EcommerceSystem {
    Scanner in = new Scanner(System.in);
    Customer customer = new Customer();
    public EcommerceSystem(){
        System.out.println("Welcome To the E-Commerce System! ");
        System.out.print("Please Enter Your ID: ");
        customer.setCustomerID(in.nextInt());
        in.nextLine();
        System.out.print("Please Enter Your Name: ");
        customer.setName(in.nextLine());
        System.out.print("Please Enter Your Address: ");
        customer.setAddress(in.nextLine());

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EcommerceSystem e = new EcommerceSystem();
        ElectronicProduct el = new ElectronicProduct();
        el.setName("smartphone");
        el.setProductID(1);
        el.setPrice(599.9);
        el.setBrand("Samsung");
        el.setWarrantyPeriod(1);
        ClothingProduct c = new ClothingProduct();
        c.setName("T-shirt");
        c.setProductID(2);
        c.setPrice(19.99);
        c.setSize("Medium");
        c.setFabric("Cotton");
        BookProduct b = new BookProduct();
        b.setName("OOP");
        b.setProductID(3);
        b.setPrice(39.99);
        b.setAuthor("O’Reilly");
        b.setPublisher("X publications");
        System.out.print("How many products You want to add to your cart ? ");
        Cart cart = new Cart(e.customer);
        cart.setnProducts(in.nextInt());
        int i;
        // adding products ....
        for (int j = 0; j < cart.getnProducts() ; j++) {
            System.out.println("Which product you want to add ? 1- " + el.getName() + " 2- " + c.getName() + " 3- " + b.getName());
            i = in.nextInt();
            switch (i) {
                case 1:
                    cart.addProduct(el , j);
                    break;
                case 2:
                    cart.addProduct(c , j);
                    break;
                case 3:
                    cart.addProduct(b , j);
                    break;

            }

        }
        System.out.println("Your Total is $"+cart.CalculatePrice()+" Would you like to place the order ? 1-Yes  2-No");
        cart.PlaceOrder(in.nextInt()); 


    }
}
