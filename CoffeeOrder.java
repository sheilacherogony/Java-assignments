class CoffeeOrder {
    String size;
    double price;

    // Constructor
    public CoffeeOrder(String size, double price) {
        this.size = size;
        this.price = price;
    }

    // Method to display order details
    public void displayOrder() {
        System.out.println("Coffee Size: " + size + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects using constructor
        CoffeeOrder order1 = new CoffeeOrder("Large", 250.0);
        CoffeeOrder order2 = new CoffeeOrder("Medium", 180.0);

        // Displaying details
        order1.displayOrder();
        order2.displayOrder();
    }
}