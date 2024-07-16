package hexlet.code.games;

import static hexlet.code.utils.Util.RANDOM_GENERATOR;

public final class EvenGame implements Game {

    private static final String CORRECT_ANSWER_FOR_EVEN = "yes";
    private static final String CORRECT_ANSWER_FOR_ODD = "no";
    private static final int MAX_EVEN_NUMBER = 100;

    @Override
    public String[] getQuestionAndAnswer() {
        int question = RANDOM_GENERATOR.nextInt(1, MAX_EVEN_NUMBER);
        String answer;
        if (question % 2 == 0) {
            answer = CORRECT_ANSWER_FOR_EVEN;
        } else {
            answer = CORRECT_ANSWER_FOR_ODD;
        }
        return new String[]{String.valueOf(question), answer};
    }

    @Override
    public String explainRules() {
        return String.format(
                "Answer '%s' if the number is even, otherwise answer '%s'.",
                CORRECT_ANSWER_FOR_EVEN,
                CORRECT_ANSWER_FOR_ODD
        );
    }
}
