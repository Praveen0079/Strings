import java.util.Scanner;

public class TrimString {
    // Method to trim leading and trailing spaces using charAt()
    public static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1; 
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    // Method to create a substring manually using charAt()
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = scanner.nextLine();
        int[] indices = findTrimIndices(input);
        String trimmedCustom = customSubstring(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();
        
        System.out.println("Custom Trimmed: '" + trimmedCustom + "'");
        System.out.println("Built-in Trimmed: '" + trimmedBuiltIn + "'");
        System.out.println("Are both trims identical? " + compareStrings(trimmedCustom, trimmedBuiltIn));
    }
}
