public class SalesData {
    public static void main(String[] args) {
        int[][][] sales = {
            {
                {10, 20, 30},
                {15, 25, 35}
            },
            {
                {5, 10, 15},
                {8, 16, 24}
            }
        };

        // Print all elements
        for (int i = 0; i < sales.length; i++) {
            System.out.println("Branch " + (i + 1));
            for (int j = 0; j < sales[i].length; j++) {
                for (int k = 0; k < sales[i][j].length; k++) {
                    System.out.print(sales[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        // Total sales for Branch 1
        int total = 0;
        for (int j = 0; j < sales[0].length; j++) {
            for (int k = 0; k < sales[0][j].length; k++) {
                total += sales[0][j][k];
            }
        }

        System.out.println("Total sales for Branch 1: " + total);
    }
}
