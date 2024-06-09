package hexlet.code;

import java.util.Random;

import static hexlet.code.Cli.SCANNER;
import static hexlet.code.Cli.userGreeting;

public class GameEven {

    private static final String USER_ANSWER_EVEN = "yes";
    private static final String USER_ANSWER_ODD = "no";
    private static final int COUNT_GAMES = 3;

    public static void runGame() {
        String userName = userGreeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random randomGenerator = new Random();
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
        if (randomNumber % 2 == 0 && !USER_ANSWER_EVEN.equals(userInput)) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
            return false;
        } else if (randomNumber % 2 != 0 && !USER_ANSWER_ODD.equals(userInput)) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            return false;
        } else {
            System.out.println("Correct!");
            return true;
        }
    }
}
