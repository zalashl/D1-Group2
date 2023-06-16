/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gofishgame;

import java.util.Scanner;


/**
 *
 * @author shlok
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HigherLowerGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Higher or Lower!");

        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();

        List<HigherLower> games = new ArrayList<>();

        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter the name of Player " + (i + 1) + ": ");
            String playerName = scanner.nextLine();

            HigherLower game = new HigherLower(playerName);
            games.add(game);
        }

        boolean continuePlaying = true;
        while (continuePlaying) {
            for (HigherLower game : games) {
                game.playRound(scanner);

                System.out.print("Continue playing? (y/n): ");
                String choice = scanner.nextLine().toLowerCase();

                if (choice.equals("n")) {
                    continuePlaying = false;
                    break;
                }
            }
        }

        System.out.println("Game over!");
        for (HigherLower game : games) {
            game.displayScore();
        }

        scanner.close();
    }
}

