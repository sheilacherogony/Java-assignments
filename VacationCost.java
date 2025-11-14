public class VacationCost {

    // Method to calculate total Vacation cost
    public static double calculateTotalCost(double accommodation, double mealCost, double activityCost) {
        return accommodation + mealCost + activityCost;
    }

    public static void main(String[] args) {
        double accommodation = 850.50;
        double meals = 300.25;
        double activities = 300.00;

        double totalCost = calculateTotalCost(accommodation, meals, activities);

        System.out.println("Total Vacation Cost: $" + totalCost);
    }

}