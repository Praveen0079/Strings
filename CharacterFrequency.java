import java.util.Scanner;

public class CharacterFrequency {
    
    // Method to find the frequency of characters in a string
    public static int[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // ASCII character frequency array

        // Loop to count character frequencies
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Store characters and their frequencies in a 2D array
        int[][] charFrequencyArray = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                charFrequencyArray[index][0] = i;  // Store ASCII value of character
                charFrequencyArray[index][1] = frequency[i]; // Store frequency
                index++;
            }
        }

        return charFrequencyArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Finding character frequency
        int[][] result = findCharacterFrequency(input);

        // Displaying the result
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int[] charFreq : result) {
            System.out.println("    " + (char) charFreq[0] + "     |     " + charFreq[1]);
        }
    }
}