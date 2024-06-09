package hexlet.code;

import static hexlet.code.Cli.SCANNER;
import static hexlet.code.Cli.userGreeting;
import static hexlet.code.GameEven.runGame;

public class App {

    public static final int FIRST_GAME = 1;
    public static final int SECOND_GAME = 2;

    public static void main(String[] args) {
        printGameMenu();
        int userChoice = Integer.parseInt(SCANNER.nextLine());
        System.out.println();
        switch (userChoice) {
            case SECOND_GAME:
                runGame();
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
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }

}
