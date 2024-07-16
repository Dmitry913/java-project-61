package hexlet.code;

import static hexlet.code.utils.Util.SCANNER;

public class Cli {

    public static void firstGame() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = SCANNER.nextLine();
        System.out.println("Hello, " + username + "!");
    }
}
