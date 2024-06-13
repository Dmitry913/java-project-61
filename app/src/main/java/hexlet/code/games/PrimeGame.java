package hexlet.code.games;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

import static hexlet.code.Engine.RANDOM_GENERATOR;

public class PrimeGame {

    private static final String CORRECT_ANSWER_FOR_PRIME = "yes";
    private static final String CORRECT_ANSWER_FOR_COMPOSITE = "no";
    private static final Set<Integer> PRIME_NUMBER;
    private static final Predicate<Integer> IS_PRIME;

    static {
        PRIME_NUMBER = new HashSet<>(Arrays.asList(
                2, 3, 5, 7, 11, 13, 17, 19, 23,
                29, 31, 37, 41, 43, 47, 53, 59,
                61, 67, 71, 73, 79, 83, 89, 97
        ));
        IS_PRIME = PRIME_NUMBER::contains;
    }

    private int hiddenNumber;

    public String generateQuestion() {
        hiddenNumber = RANDOM_GENERATOR.nextInt(1, 100);
        return String.valueOf(hiddenNumber);
    }

    public String getAnswer() {
        if (IS_PRIME.test(hiddenNumber)) {
            return CORRECT_ANSWER_FOR_PRIME;
        } else {
            return CORRECT_ANSWER_FOR_COMPOSITE;
        }
    }

    public String explainRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}
