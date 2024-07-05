package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static Integer selectGame() {
        return Integer.parseInt(SCANNER.nextLine());
    }

    public static String getUsername() {
        System.out.print("May I have your name? ");
        return SCANNER.nextLine();
    }

    public static String getUserAnswer() {
        System.out.print("Your answer: ");
        return SCANNER.nextLine();
    }
}
