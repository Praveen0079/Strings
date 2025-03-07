import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method to find the frequency of characters using nested loops
    public static String[] findCharacterFrequency(String text) {
        char[] charArray = text.toCharArray(); // Convert string to character array
        int length = charArray.length;
        int[] frequency = new int[length];

        // Initialize frequency array and mark all characters as counted
        for (int i = 0; i < length; i++) {
            frequency[i] = 1;
            if (charArray[i] == '0') // Skip if already counted
                continue;

            // Inner loop to count duplicates
            for (int j = i + 1; j < length; j++) {
                if (charArray[i] == charArray[j]) {
                    frequency[i]++;
                    charArray[j] = '0'; // Mark duplicate as '0' to avoid counting again
                }
            }
        }

        // Count unique characters
        int uniqueCount = 0;
        for (char c : charArray) {
            if (c != '0') {
                uniqueCount++;
            }
        }

        // Store unique characters and their frequencies in a 1D String array
        String[] charFrequencyArray = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (charArray[i] != '0') {
                charFrequencyArray[index] = charArray[i] + " : " + frequency[i];
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
        String[] result = findCharacterFrequency(input);

        // Displaying the result
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String charFreq : result) {
            System.out.println("    " + charFreq.replace(":", "     |     "));
        }
    }
}