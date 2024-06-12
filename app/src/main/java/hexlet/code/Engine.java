package hexlet.code;

import hexlet.code.games.Game;

import static hexlet.code.Cli.SCANNER;
import static hexlet.code.Cli.userGreeting;

public class Engine {

    private static final int COUNT_GAMES = 3;

    public static void runFlow(Game game) {
        String userName = userGreeting();
        System.out.println(game.explainRules());

        for (int i = 0; i < COUNT_GAMES; i++) {
            System.out.println("Question: " + game.generateQuestion());
            if (!checkAnswer(game.getAnswer())) {
                System.out.printf("Let's try again, %s!\n", userName);
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", userName);
    }


    private static boolean checkAnswer(String correctAnswer) {
        System.out.print("Your answer: ");
        String userAnswer = SCANNER.nextLine();
        if (!correctAnswer.equals(userAnswer)) {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", userAnswer, correctAnswer);
            return false;
        } else {
            System.out.println("Correct!");
            return true;
        }
    }
}
