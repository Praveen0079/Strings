import java.util.Scanner;

public class StringLengthWithoutBuiltIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: "); 
        String text = scanner.next();

        int length1 = findLength(text);
        int length2 = text.length();

        System.out.println("User-defined length: " + length1);
        System.out.println("Built-in length: " + length2);
        System.out.println("Results match: " + (length1 == length2));
    }

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
}
