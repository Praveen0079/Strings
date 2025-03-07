import java.util.Scanner; 

public class ShortestLongestWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        String[][] wordsWithLengths = getWordsWithLengths(text);
        int[] shortestLongest = findShortestAndLongest(wordsWithLengths);

        System.out.println("Shortest word: " + wordsWithLengths[shortestLongest[0]][0]);
        System.out.println("Longest word: " + wordsWithLengths[shortestLongest[1]][0]);
    }

    public static int[] findShortestAndLongest(String[][] wordsWithLengths) {
        int shortestIndex = 0, longestIndex = 0;
        for (int i = 1; i < wordsWithLengths.length; i++) {
            if (Integer.parseInt(wordsWithLengths[i][1]) < Integer.parseInt(wordsWithLengths[shortestIndex][1])) {
                shortestIndex = i;
            }
            if (Integer.parseInt(wordsWithLengths[i][1]) > Integer.parseInt(wordsWithLengths[longestIndex][1])) {
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }

    public static String[][] getWordsWithLengths(String text) {
        String[] words = splitText(text);
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
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
