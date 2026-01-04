public class OneDArrayExample {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};

        // Print elements
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Calculate sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("\nSum of elements: " + sum);
    }
}
