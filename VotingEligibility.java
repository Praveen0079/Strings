import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {
    // Method to generate random ages for n students
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(50) + 1; // Generates age between 1 and 50
        }
        return ages;
    }

    // Method to determine if students can vote
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    // Method to display the results in a table format
    public static void displayResults(String[][] results) {
        System.out.println("Age | Eligibility");
        System.out.println("-----------------");
        for (String[] row : results) {
            System.out.println(row[0] + "   | " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int[] ages = generateAges(n);
        String[][] results = checkVotingEligibility(ages);
        displayResults(results);
    }
}