package hexlet.code;

import hexlet.code.games.Game;

import java.util.Random;

public class Engine {

    private static final int COUNT_GAMES = 3;
    public static final Random RANDOM_GENERATOR = new Random();

    public static void runFlow(Game game) {
        String rules = game.explainRules();

        Greeting.welcome();
        String username = Cli.getUsername();
        Greeting.helloUser(username);

        System.out.println(rules);

        for (int i = 0; i < COUNT_GAMES; i++) {
            String[] questionAndAnswer = game.getQuestionAndAnswer();
            String question = questionAndAnswer[0];
            String correctAnswer = questionAndAnswer[1];
            System.out.println("Question: " + question);

            String userAnswer = Cli.getUserAnswer();
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
