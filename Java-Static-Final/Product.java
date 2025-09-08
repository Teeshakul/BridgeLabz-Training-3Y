public class Product {
    private static double discount = 0.0;
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double d) {
        discount = d;
    }

    public double getDiscountedPrice() {
        return price - (price * discount / 100);
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: " + getDiscountedPrice());
        }
    }

    public static void main(String[] args) {
        Product.updateDiscount(10);
        Product p1 = new Product("P1", "Laptop", 1200, 5);
        Product p2 = new Product("P2", "Phone", 800, 10);
        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}
