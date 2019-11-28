import java.util.HashMap;
import java.util.Map;

class Scrabble {
    private int score;
    private Map<Character, Integer> scrabble;

    Scrabble(String word) {
        initScrabble();
        score = word.chars()
                .map(Character::toLowerCase)
                .map(letter -> scrabble.get((char) letter))
                .sum();
    }

    int getScore() {
        return score;
    }

    private void initScrabble() {
        scrabble = new HashMap<>();
        putOnScrabble("aeioulnrst", 1);
        putOnScrabble("dg", 2);
        putOnScrabble("bcmp", 3);
        putOnScrabble("fhvwy", 4);
        putOnScrabble("k", 5);
        putOnScrabble("jx", 8);
        putOnScrabble("qz", 10);
    }

    private void putOnScrabble(String keyArray, int value) {
        keyArray.chars().forEach(letter -> scrabble.put((char) letter, value));
    }
}
