package hexlet.code.games;

import java.util.Random;

public interface Game {

    Random RANDOM_GENERATOR = new Random();

    String generateQuestion();

    String getAnswer();

    String explainRules();
}
