import java.util.Scanner;

public class SubstringComparison {
    
    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String substring = "";
        for (int i = start; i < end; i++) {
            substring += text.charAt(i);
        }
        return substring;
    }
    
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        
        // Creating substring using charAt()
        String substring1 = createSubstring(text, start, end);
        
        // Creating substring using built-in method
        String substring2 = text.substring(start, end);
        
        // Comparing both substrings
        boolean areEqual = compareStrings(substring1, substring2);
        
        // Display results
        System.out.println("Substring using charAt(): " + substring1);
        System.out.println("Substring using substring(): " + substring2);
        System.out.println("Are both substrings equal? " + areEqual);
        
    }
}
