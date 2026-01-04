import java.util.Scanner;

class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Apply discount method
    public void applyDiscount(double percentage) {
        price = price - (price * (percentage / 100));
    }

    // Getter
    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Product object
        Product p = new Product("Laptop", 50000);

        // Ask for discount
        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        // Apply discount
        p.applyDiscount(discount);

        // Display result
        System.out.println("New price: " + p.getPrice());
    }
}
