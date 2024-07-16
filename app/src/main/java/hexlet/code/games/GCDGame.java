package hexlet.code.games;

import static hexlet.code.utils.Util.RANDOM_GENERATOR;

public final class GCDGame implements Game {

    private static final int MAX_GCD_NUMBER = 100;

    @Override
    public String[] getQuestionAndAnswer() {
        int firstNumber = RANDOM_GENERATOR.nextInt(1, MAX_GCD_NUMBER);
        int secondNumber = RANDOM_GENERATOR.nextInt(1, MAX_GCD_NUMBER);
        int answer = findGCD(firstNumber, secondNumber);
        return new String[]{String.format("%d %d", firstNumber, secondNumber), String.valueOf(answer)};
    }

    @Override
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
