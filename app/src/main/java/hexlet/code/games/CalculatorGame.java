package hexlet.code.games;

public class CalculatorGame implements Game {

    private int answer;

    @Override
    public String generateQuestion() {
        int firstNumber = RANDOM_GENERATOR.nextInt(1, 100);
        int secondNumber = RANDOM_GENERATOR.nextInt(1, 100);
        String template = "%d %s %d";
        String question;

        switch (RANDOM_GENERATOR.nextInt(1, 4)) {
            case 1:
                question = String.format(template, firstNumber, "+", secondNumber);
                answer = firstNumber + secondNumber;
                break;
            case 2:
                question = String.format(template, firstNumber, "-", secondNumber);
                answer = firstNumber - secondNumber;
                break;
            case 3:
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
