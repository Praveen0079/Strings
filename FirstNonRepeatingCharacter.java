import java.util.Scanner;

public class FirstNonRepeatingCharacter {
     
    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256]; // ASCII character frequency array
        
        // Loop to count character frequencies
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++; 
        }

        // Loop to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i); // Return first non-repeating character
            }
        }

        return '\0'; // Return null character if no non-repeating character found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Finding first non-repeating character
        char result = findFirstNonRepeatingChar(input);

        // Displaying result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        } 
    }
}
