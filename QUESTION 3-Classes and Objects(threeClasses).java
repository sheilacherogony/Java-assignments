import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Product object
        Product product = new Product("Laptop", 1000.0);

        // Ask the user to enter a discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        // Apply the discount using the method
        product.applyDiscount(discountPercentage);

        // Display the new price of the product
        System.out.println("The new price of the " + product.name + " is: $" + product.getPrice());

        scanner.close();
    }
}
