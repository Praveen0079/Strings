import java.util.Scanner;

public class BMICalculator {
     
    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0; // Convert cm to meters
            double bmi = weight / (height * height);
            
            // Determine BMI status
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 24.9) status = "Normal weight";
            else if (bmi < 29.9) status = "Overweight";
            else status = "Obese";

            // Store results
            result[i][0] = String.format("%.2f", data[i][1]); // Height in cm
            result[i][1] = String.format("%.2f", data[i][0]); // Weight in kg
            result[i][2] = String.format("%.2f", bmi); // BMI
            result[i][3] = status; // BMI Status
        }

        return result;
    }

    // Method to display the BMI table
    public static void displayBMIResults(String[][] bmiData) {
        System.out.println("\n--------------------------------------------------");
        System.out.printf("| %-10s | %-10s | %-10s | %-15s |\n", "Height (cm)", "Weight (kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------");

        for (String[] person : bmiData) {
            System.out.printf("| %-10s | %-10s | %-10s | %-15s |\n", person[0], person[1], person[2], person[3]);
        }
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        // Taking user input for height and weight
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Compute BMI and Status
        String[][] bmiResults = calculateBMI(data);

        // Display the results
        displayBMIResults(bmiResults);
        
        
    }
}
