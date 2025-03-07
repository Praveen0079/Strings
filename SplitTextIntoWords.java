import java.util.Scanner;

public class SplitTextIntoWords {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        String[] words1 = splitText(text);
        String[] words2 = text.split(" ");

        System.out.println("User-defined split: " + String.join(", ", words1));
        System.out.println("Built-in split: " + String.join(", ", words2));
        System.out.println("Results match: " + compareStringArrays(words1, words2));
    }

    public static String[] splitText(String text) {
        int wordCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }
        String[] words = new String[wordCount + 1];
        int start = 0, index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start);
        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

/*  Enter a sentence: abc
    User-defined split: abc
    Built-in split: abc
    Results match: true
*/
}
