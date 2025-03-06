import java.util.Scanner;

public class SubstringComparison {
    
    // creating a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        
        // Getting substring using charAt()
        String substringCharAt = createSubstring(text, start, end);
        
        // Getting substring using built-in substring() method
        String substringBuiltIn = text.substring(start, end);
        
        // Comparing both substrings
        boolean areEqual = compareStrings(substringCharAt, substringBuiltIn);
        
        // Display results
        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using substring(): " + substringBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);
        
    }
}
