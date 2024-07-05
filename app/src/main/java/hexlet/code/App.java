package hexlet.code;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

public class App {

    public static final int FIRST_GAME = 1;
    public static final int SECOND_GAME = 2;
    public static final int THIRD_GAME = 3;
    public static final int FOURTH_GAME = 4;
    public static final int FIFTH_GAME = 5;
    public static final int SIXTH_GAME = 6;

    public static void main(String[] args) {
        printGameMenu();
        int userChoice = Cli.selectGame();
        System.out.println();
        switch (userChoice) {
            case SIXTH_GAME:
                Engine.runFlow(new PrimeGame());
                break;
            case FIFTH_GAME:
                Engine.runFlow(new ProgressionGame());
                break;
            case FOURTH_GAME:
                Engine.runFlow(new GCDGame());
                break;
            case THIRD_GAME:
                Engine.runFlow(new CalculatorGame());
                break;
            case SECOND_GAME:
                Engine.runFlow(new EvenGame());
                break;
            case FIRST_GAME:
                firstGame();
                break;
            default:
                throw new RuntimeException(String.format("Игры %s не сущестует", userChoice));
        }
    }

    private static void firstGame() {
        Greeting.welcome();
        String username = Cli.getUsername();
        Greeting.helloUser(username);
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
