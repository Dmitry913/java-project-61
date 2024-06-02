package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void userGreeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = SCANNER.nextLine();
        System.out.println("Hello, " + username + "!");
    }
}
