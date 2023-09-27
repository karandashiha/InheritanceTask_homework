package app;

import java.util.Scanner;

import app.game.Game;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter the dropped number (1-10): ");
            number = scanner.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("The number must be in the range from 1 to 10.");
            }
        } while (number < 1 || number > 10);

        System.out.print("Enter a bet: ");
        double bet = scanner.nextDouble();

        Game game = new Game(number, bet);
        String winnings = game.getWinnings();

        System.out.println("Winning: " + winnings);

        scanner.close();
    }
}