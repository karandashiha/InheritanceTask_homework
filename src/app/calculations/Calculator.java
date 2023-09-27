package app.calculations;

public class Calculator {
    public static double calWinnings(int number, double bet) {
        if (number < 3) {
            return 1.25 * bet; // Виграш - 125% ставки
        } else if (number >= 3 && number <= 7) {
            double winnings = 1.25 * bet; // Виграш - 125% ставки
            double tax = 0.05 * bet; // Збір 5% від ставки
            return winnings - tax;
        } else {
            double winnings = 2 * bet; // Виграш - подвійна ставка
            double tax = 0.1 * winnings; // Збір 10% від виграшу
            return winnings - tax;
        }
    }
}
