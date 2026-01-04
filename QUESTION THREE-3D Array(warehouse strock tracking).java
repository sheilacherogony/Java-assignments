public class WarehouseStock {
    public static void main(String[] args) {
        int[][][] stock = {
            {
                {10, 20, 30},
                {40, 25, 15}
            },
            {
                {60, 35, 25},
                {15, 20, 18}
            }
        };

        // Print stock values
        for (int i = 0; i < stock.length; i++) {
            System.out.println("Warehouse " + (i + 1));
            for (int j = 0; j < stock[i].length; j++) {
                for (int k = 0; k < stock[i][j].length; k++) {
                    System.out.print(stock[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        // Total stock in Warehouse 2
        int total = 0;
        for (int j = 0; j < stock[1].length; j++) {
            for (int k = 0; k < stock[1][j].length; k++) {
                total += stock[1][j][k];
            }
        }

        System.out.println("Total stock in Warehouse 2: " + total);
    }
}
