package hexlet.code;

import java.util.Random;

import static hexlet.code.Cli.SCANNER;
import static hexlet.code.Cli.userGreeting;

public class Engine {

    private static final int COUNT_GAMES = 3;
    public static final Random RANDOM_GENERATOR = new Random();

    public static void runFlow(String question, String rules, String answer) {
        String userName = userGreeting();
        System.out.println(rules);

        for (int i = 0; i < COUNT_GAMES; i++) {
            System.out.println("Question: " + question);
            if (!checkAnswer(answer)) {
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
