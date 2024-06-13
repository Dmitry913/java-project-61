package hexlet.code.games;

import static hexlet.code.Engine.RANDOM_GENERATOR;

public class EvenGame {

    private static final String CORRECT_ANSWER_FOR_EVEN = "yes";
    private static final String CORRECT_ANSWER_FOR_ODD = "no";

    private String answer;

    public String generateQuestion() {
        int question = RANDOM_GENERATOR.nextInt(1, 100);
        if (question % 2 == 0) {
            answer = CORRECT_ANSWER_FOR_EVEN;
        } else {
            answer = CORRECT_ANSWER_FOR_ODD;
        }
        return String.valueOf(question);
    }

    public String getAnswer() {
        return answer;
    }

    public String explainRules() {
        return String.format(
                "Answer '%s' if the number is even, otherwise answer '%s'.",
                CORRECT_ANSWER_FOR_EVEN,
                CORRECT_ANSWER_FOR_ODD
        );
    }
}
