import java.util.Scanner;

// Superclass
class Employee {
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass
class Lecturer extends Employee {
    String department;

    // Constructor
    Lecturer(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    // Overriding displayInfo method
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

// Main class
public class UniversitySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // clear buffer

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        // Create Lecturer object
        Lecturer lecturer = new Lecturer(name, salary, department);

        // Display information using overridden method
        System.out.println("\nLecturer Details:");
        lecturer.displayInfo();

        sc.close();
    }
}