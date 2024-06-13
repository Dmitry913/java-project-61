package hexlet.code.games;

public class CalculatorGame implements Game {

    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private int answer;

    @Override
    public String generateQuestion() {
        int firstNumber = RANDOM_GENERATOR.nextInt(1, 100);
        int secondNumber = RANDOM_GENERATOR.nextInt(1, 100);
        String template = "%d %s %d";
        String question;

        switch (RANDOM_GENERATOR.nextInt(ADDITION, MULTIPLICATION + 1)) {
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
                question = "";
                answer = Integer.MIN_VALUE;
                break;
        }
        return question;
    }

    @Override
    public String getAnswer() {
        return String.valueOf(answer);
    }

    @Override
    public String explainRules() {
        return "What is the result of the expression?";
    }
}
