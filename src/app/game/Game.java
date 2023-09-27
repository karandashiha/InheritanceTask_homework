package app.game;

import app.utils.Rounder;
import app.calculations.Calculator;

public class Game {
    private int number;
    private double bet;
    private double winnings;

    public Game(int number, double bet) {
        this.number = number;
        this.bet = bet;
        calWinnings();
    }

    public void calWinnings() {
        winnings = Calculator.calWinnings(number, bet);
    }

    public String getWinnings() {
        return Rounder.roundValue(winnings);
    }

}