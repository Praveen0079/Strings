import java.util.Scanner;

public class PalindromeChecker {
 
    // Logic 1: Compare characters from start and end using iteration
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Compare characters from start and end using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Compare original and reversed character arrays
    public static boolean isPalindromeUsingArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = new char[originalArray.length];

        // Reverse the character array
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Compare both arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String processedInput = input.replaceAll("\\s+", "").toLowerCase(); // Remove spaces and convert to lowercase

        // Checking palindrome using all three logic
        boolean iterativeResult = isPalindromeIterative(processedInput);
        boolean recursiveResult = isPalindromeRecursive(processedInput, 0, processedInput.length() - 1);
        boolean arrayResult = isPalindromeUsingArray(processedInput);

        // Displaying results
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Using Iteration: " + (iterativeResult ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Recursion: " + (recursiveResult ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Character Arrays: " + (arrayResult ? "Palindrome" : "Not a Palindrome"));
    }
}
