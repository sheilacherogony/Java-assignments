public class StudentMarksTable {
    public static void main(String[] args) {
        int[][] marks = {
            {75, 80, 85}, // Student 1
            {65, 70, 85}, // Student 2
            {88, 92, 81}  // Student 3
        };

        // Print table
        System.out.println("Student Marks Table:");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        // Average of Student 3
        int sum = 0;
        for (int j = 0; j < marks[2].length; j++) {
            sum += marks[2][j];
        }
        double avg = (double) sum / marks[2].length;

        System.out.println("Average marks of Student 3: " + avg);
    }
}
