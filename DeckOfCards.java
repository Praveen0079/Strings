import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {

    // Suits and Ranks for the deck
    private static final String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    private static final String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"  };

    // Total number of cards in the deck
    private static final int numOfCards = suits.length * ranks.length;

    // Method to initialize the deck
    public static String[] initializeDeck() {
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + rand.nextInt(numOfCards - i); // Swap with a random card
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n * x > numOfCards) {
            System.out.println("Not enough cards in the deck to distribute!");
            return null;
        }

        String[][] players = new String[x][n];
        int cardIndex = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        if (players == null) return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter number of players: ");
        int numPlayers = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int numCardsPerPlayer = sc.nextInt();

        // Initialize and shuffle deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        // Distribute cards and display results
        String[][] players = distributeCards(deck, numCardsPerPlayer, numPlayers);
        printPlayersCards(players);
    }
}
