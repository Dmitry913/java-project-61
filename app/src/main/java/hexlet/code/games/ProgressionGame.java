package hexlet.code.games;

import static hexlet.code.Engine.RANDOM_GENERATOR;

public final class ProgressionGame implements Game {

    private static final int PROGRESSION_LENGTH_MIN = 5;
    private static final int PROGRESSION_LENGTH_MAX = 15; // not included
    private static final int INCREMENT_MIN = 1;
    private static final int INCREMENT_MAX = 9; // not included
    private static final int START_VALUE_MIN = 3;
    private static final int START_VALUE_MAX = 12; // not included

    @Override
    public String[] getQuestionAndAnswer() {
        int length = RANDOM_GENERATOR.nextInt(PROGRESSION_LENGTH_MIN, PROGRESSION_LENGTH_MAX);
        int hidePosition = RANDOM_GENERATOR.nextInt(0, length);
        int increment = RANDOM_GENERATOR.nextInt(INCREMENT_MIN, INCREMENT_MAX);
        int startValue = RANDOM_GENERATOR.nextInt(START_VALUE_MIN, START_VALUE_MAX);
        int previousValue = startValue;
        StringBuilder questionBuilder = new StringBuilder();
        int answer = 0;
        if (hidePosition == 0) {
            questionBuilder.append("..");
            answer = startValue;
        } else {
            questionBuilder.append(startValue);
        }
        for (int i = 1; i < length; i++) {
            int currentValue = previousValue + increment;
            if (i == hidePosition) {
                questionBuilder.append(" ..");
                answer = currentValue;
            } else {
                questionBuilder.append(" ").append(currentValue);
            }
            previousValue = currentValue;
        }
        return new String[]{questionBuilder.toString().trim(), String.valueOf(answer)};
    }

    @Override
    public String explainRules() {
        return "What number is missing in the progression?\n";
    }
}
