package hexlet.code;

import hexlet.code.games.Game;

import static hexlet.code.utils.Util.SCANNER;

public class Engine {

    private static final int COUNT_GAMES = 3;

    public static void runFlow(Game game) {
        String rules = game.explainRules();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = SCANNER.nextLine();
        System.out.println("Hello, " + username + "!");

        System.out.println(rules);

        for (int i = 0; i < COUNT_GAMES; i++) {
            String[] questionAndAnswer = game.getQuestionAndAnswer();
            String question = questionAndAnswer[0];
            String correctAnswer = questionAndAnswer[1];
            System.out.println("Question: " + question);

            System.out.print("Your answer: ");
            String userAnswer = SCANNER.nextLine();
            if (!correctAnswer.equals(userAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", userAnswer, correctAnswer);
                System.out.printf("Let's try again, %s!\n", username);
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.printf("Congratulations, %s!\n", username);
    }

}
