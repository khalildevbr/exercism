import java.util.HashMap;

class Scrabble {
    private int score;
    private HashMap<String, Integer> scrabble = initScrabble();

    Scrabble(String word) {
        score = word.chars()
                .map(Character::toLowerCase)
                .map(letter -> getValue((char) letter))
                .sum();
    }

    int getScore() {
        return score;
    }

    private HashMap<String, Integer> initScrabble() {
        return new HashMap<String, Integer>() {
            {
                put("aeioulnrst", 1);
                put("dg", 2);
                put("bcmp", 3);
                put("fhvwy", 4);
                put("k", 5);
                put("jx", 8);
                put("qz", 10);
            }
        };
    }

    private int getValue(Character letter) {
        final String[] foundKey = {letter.toString()};
        scrabble.forEach((key, value) -> {
            if (key.contains(letter.toString())) {
                foundKey[0] = key;
            }
        });

        return  scrabble.get(foundKey[0]);
    }
}
