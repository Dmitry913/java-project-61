package hexlet.code.games;

import static hexlet.code.Engine.RANDOM_GENERATOR;

public class GCDGame {

    private int answer;

    public String generateQuestion() {
        int firstNumber = RANDOM_GENERATOR.nextInt(1, 100);
        int secondNumber = RANDOM_GENERATOR.nextInt(1, 100);
        answer = findGCD(firstNumber, secondNumber);
        return String.format("%d %d", firstNumber, secondNumber);
    }

    public String getAnswer() {
        return String.valueOf(answer);
    }

    public String explainRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    private int findGCD(int firstNumber, int secondNumber) {
        int dividend = Math.max(firstNumber, secondNumber);
        int divider = Math.min(firstNumber, secondNumber);
        int remainder = dividend % divider;
        while (remainder != 0) {
            dividend = divider;
            divider = remainder;
            remainder = dividend % divider;
        }
        return divider;
    }
}
