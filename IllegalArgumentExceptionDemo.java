import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    
    // Method to generate IllegalArgumentException
    public static void generateException(String text) { 
        System.out.println(text.substring(5, 2)); // This will throw IllegalArgumentException
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2)); // Attempting invalid substring operation
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        // Call method to generate exception
         //generateException(text); // Uncomment to see exception
        
        // Call method to handle exception
        handleException(text);
        
    }
}
