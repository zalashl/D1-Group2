/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gofishgame;

import java.util.Scanner;

public class HigherLower {
    private String playerName;
    private Deck deck;
    private int score;

    public HigherLower(String playerName) {
        this.playerName = playerName;
        this.deck = new Deck();
        this.score = 0;
    }

    public void playRound(Scanner scanner) {
        deck.shuffle();

        Card currentCard = deck.drawCard();
        System.out.println(playerName + ", your card is: " + currentCard);

        while (true) {
            System.out.print("Will the next card be higher or lower? (h/l): ");
            String guess = scanner.nextLine().toLowerCase();

            Card nextCard = deck.drawCard();
            System.out.println("Next card: " + nextCard);

            int comparison = currentCard.compareTo(nextCard);
            if (comparison < 0 && guess.equals("h")) {
                System.out.println("Correct! The next card was higher.");
                score++;
            } else if (comparison > 0 && guess.equals("l")) {
                System.out.println("Correct! The next card was lower.");
                score++;
            } else {
                System.out.println("Wrong guess! Round over.");
                break;
            }

            currentCard = nextCard;
        }
    }

    public void displayScore() {
        System.out.println(playerName + "'s score: " + score);
    }
}
