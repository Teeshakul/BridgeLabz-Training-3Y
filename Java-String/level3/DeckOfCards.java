import java.util.Scanner;

public class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int n, int players) {
        if (n * players > deck.length) return null;
        String[][] result = new String[players][n];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int n = sc.nextInt();
        String[][] hands = distributeCards(deck, n, players);
        if (hands == null) {
            System.out.println("Not enough cards to distribute.");
        } else {
            for (int i = 0; i < players; i++) {
                System.out.print("Player " + (i+1) + ": ");
                for (int j = 0; j < n; j++) {
                    System.out.print(hands[i][j] + ", ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
