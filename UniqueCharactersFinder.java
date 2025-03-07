import java.util.Scanner;

public class UniqueCharactersFinder {
     
    // Method to find the length of the string without using length()
    public static int findStringLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length); // Try accessing characters
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when we go beyond the string length
        }
        return length;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        int strLength = findStringLength(text);
        char[] uniqueChars = new char[strLength]; // Array to store unique characters
        int uniqueCount = 0;

        // Loop through each character
        for (int i = 0; i < strLength; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character already exists in the unique array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add it to the array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array with exact size
        char[] finalUniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalUniqueChars[i] = uniqueChars[i];
        }

        return finalUniqueChars;
    }

    // Main method to take input and display unique characters
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Finding unique characters
        char[] uniqueCharacters = findUniqueCharacters(input);

        // Displaying the result
        System.out.print("Unique Characters: ");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " ");
        }
    }
}
