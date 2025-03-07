import java.util.Scanner;

public class UniqueCharacterFrequency {
 
    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        // Nested loops to find unique characters
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in the uniqueChars array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If character is unique, add it to the array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Resize the array to store only unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to find the frequency of unique characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // ASCII character frequency array

        // Loop to count character frequencies
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);
        int uniqueCount = uniqueChars.length;

        // Store characters and their frequencies in a 2D array
        String[][] charFrequencyArray = new String[uniqueCount][2];

        for (int i = 0; i < uniqueCount; i++) {
            charFrequencyArray[i][0] = String.valueOf(uniqueChars[i]); // Store character
            charFrequencyArray[i][1] = String.valueOf(frequency[uniqueChars[i]]); // Store frequency
        }

        return charFrequencyArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Finding character frequency
        String[][] result = findCharacterFrequency(input);

        // Displaying the result
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] charFreq : result) {
            System.out.println("    " + charFreq[0] + "     |     " + charFreq[1]);
        }
    }
}
