public class TwoDArrayMarks {
    public static void main(String[] args) {
        int[][] marks = {
            {80, 70, 90},
            {60, 85, 75},
            {88, 92, 79}
        };

        // Print matrix
        System.out.println("Marks Matrix:");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        // Average of first row
        int sum = 0;
        for (int j = 0; j < marks[0].length; j++) {
            sum += marks[0][j];
        }
        double average = (double) sum / marks[0].length;

        System.out.println("Average of first row: " + average);
    }
}
