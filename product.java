public class Product {
    private int product_id;
    private String name;
    private double price;

    // Parameterized constructor
    public Product(int product_id, String name, double price) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    public void display() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Create two product objects
        Product product1 = new Product(1, "Product 1", 100.0);
        Product product2 = new Product(2, "Product 2", 200.0);

        // Display product details
        System.out.println("Product 1 Details:");
        product1.display();

        System.out.println("\nProduct 2 Details:");
        product2.display();
    }
}
