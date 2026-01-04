public class ShoppingCart {
    public static void main(String[] args) {
        int[] prices = { 120, 80, 150, 60, 200, 90 };

        int total = 0;
        System.out.println("Item prices:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
            total += prices[i];
        }

        System.out.println("Total amount to pay: " + total);
    }
}
