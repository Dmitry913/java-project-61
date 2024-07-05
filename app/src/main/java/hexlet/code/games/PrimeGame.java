package hexlet.code.games;

import static hexlet.code.Engine.RANDOM_GENERATOR;

public final class PrimeGame implements Game {

    private static final String CORRECT_ANSWER_FOR_PRIME = "yes";
    private static final String CORRECT_ANSWER_FOR_COMPOSITE = "no";
    private static final int MAX_PRIME_NUMBER = 100;

    @Override
    public String[] getQuestionAndAnswer() {
        int question = RANDOM_GENERATOR.nextInt(1, MAX_PRIME_NUMBER);
        String answer;
        if (isPrime(question)) {
            answer = CORRECT_ANSWER_FOR_PRIME;
        } else {
            answer = CORRECT_ANSWER_FOR_COMPOSITE;
        }
        return new String[]{String.valueOf(question), answer};
    }

    private boolean isPrime(int number) {
        int divider = 2;
        while (divider < (number / 2 + 1)) {
            if (number % divider == 0) {
                return false;
            }
            divider++;
        }
        return true;
    }

    public String explainRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}
