package hexlet.code;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import static hexlet.code.Cli.SCANNER;
import static hexlet.code.Cli.userGreeting;

public class App {

    public static final int FIRST_GAME = 1;
    public static final int SECOND_GAME = 2;
    public static final int THIRD_GAME = 3;
    public static final int FOURTH_GAME = 4;
    public static final int FIFTH_GAME = 5;
    public static final int SIXTH_GAME = 6;

    public static void main(String[] args) {
        printGameMenu();
        int userChoice = Integer.parseInt(SCANNER.nextLine());
        System.out.println();
        switch (userChoice) {
            case SIXTH_GAME:
                PrimeGame primeGame = new PrimeGame();
                Engine.runFlow(
                        primeGame.generateQuestion(),
                        primeGame.explainRules(),
                        primeGame.getAnswer()
                );
                break;
            case FIFTH_GAME:
                ProgressionGame progressionGame = new ProgressionGame();
                Engine.runFlow(
                        progressionGame.generateQuestion(),
                        progressionGame.explainRules(),
                        progressionGame.getAnswer()
                );
                break;
            case FOURTH_GAME:
                GCDGame gcdGame = new GCDGame();
                Engine.runFlow(
                        gcdGame.generateQuestion(),
                        gcdGame.explainRules(),
                        gcdGame.getAnswer()
                );
                break;
            case THIRD_GAME:
                CalculatorGame calculatorGame = new CalculatorGame();
                Engine.runFlow(
                        calculatorGame.generateQuestion(),
                        calculatorGame.explainRules(),
                        calculatorGame.getAnswer()
                );
                break;
            case SECOND_GAME:
                EvenGame evenGame = new EvenGame();
                Engine.runFlow(
                        evenGame.generateQuestion(),
                        evenGame.explainRules(),
                        evenGame.getAnswer()
                );
                break;
            case FIRST_GAME:
                userGreeting();
                break;
            default: break;
        }
    }

    public static void printGameMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }

}
