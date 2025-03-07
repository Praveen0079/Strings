public class NullPointerDemo {
    
    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // This will throw NullPointerException
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length()); // Attempting to access null
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call method to generate exception
        // generateException(); // Uncomment to see exception
        
        // Call method to handle exception
        handleException();
    }
}
