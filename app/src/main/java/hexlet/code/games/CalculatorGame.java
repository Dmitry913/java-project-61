package hexlet.code.games;


import static hexlet.code.utils.Util.RANDOM_GENERATOR;

public final class CalculatorGame implements Game {

    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int MAX_CALC_NUMBER = 100;

    @Override
    public String[] getQuestionAndAnswer() {
        int firstNumber = RANDOM_GENERATOR.nextInt(1, MAX_CALC_NUMBER);
        int secondNumber = RANDOM_GENERATOR.nextInt(1, MAX_CALC_NUMBER);
        String template = "%d %s %d";
        String question;
        int answer = 0;
        int typeOperation = RANDOM_GENERATOR.nextInt(ADDITION, MULTIPLICATION + 1);
        switch (typeOperation) {
            case ADDITION:
                question = String.format(template, firstNumber, "+", secondNumber);
                answer = firstNumber + secondNumber;
                break;
            case SUBTRACTION:
                question = String.format(template, firstNumber, "-", secondNumber);
                answer = firstNumber - secondNumber;
                break;
            case MULTIPLICATION:
                question = String.format(template, firstNumber, "*", secondNumber);
                answer = firstNumber * secondNumber;
                break;
            default:
                throw new RuntimeException(
                        String.format(
                                "Сгенерированное число (%d) не соответствет доступным типам операций.", typeOperation)
                );
        }
        return new String[]{question, String.valueOf(answer)};
    }

    @Override
    public String explainRules() {
        return "What is the result of the expression?";
    }
}
