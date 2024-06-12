package hexlet.code.games;

public class EvenGame implements Game {

    private static final String CORRECT_ANSWER_FOR_EVEN = "yes";
    private static final String CORRECT_ANSWER_FOR_ODD = "no";
    private String answer;

    /*
    public static void runGame() {
        String userName = userGreeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < COUNT_GAMES; i++) {
            int randomNumber = randomGenerator.nextInt(1, 100);
            System.out.println("Question: " + randomNumber);
            if (!checkAnswer(randomNumber)) {
                System.out.printf("Let's try again, %s!\n", userName);
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", userName);
    }

    private static boolean checkAnswer(int randomNumber) {
        System.out.print("Your answer: ");
        String userInput = SCANNER.nextLine();
        if (randomNumber % 2 == 0 && !CORRECT_ANSWER_FOR_EVEN.equals(userInput)) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
            return false;
        } else if (randomNumber % 2 != 0 && !CORRECT_ANSWER_FOR_ODD.equals(userInput)) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            return false;
        } else {
            System.out.println("Correct!");
            return true;
        }
    }*/

    @Override
    public String generateQuestion() {
        int question = RANDOM_GENERATOR.nextInt(1, 100);
        if (question % 2 == 0) {
            answer = CORRECT_ANSWER_FOR_EVEN;
        } else {
            answer = CORRECT_ANSWER_FOR_ODD;
        }
        return String.valueOf(question);
    }

    @Override
    public String getAnswer() {
        return answer;
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
