import java.util.stream.IntStream;

class Hamming {
    private int hamming;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() == rightStrand.length()) {
            hamming = IntStream
                    .range(0, leftStrand.length())
                    .reduce(0,
                            (sum, position) -> leftStrand.charAt(position) != rightStrand.charAt(position) ?
                                    ++sum : sum);

        } else {
            if (leftStrand.isEmpty())
                throw new IllegalArgumentException("left strand must not be empty.");
            if (rightStrand.isEmpty())
                throw new IllegalArgumentException("right strand must not be empty.");
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

    }

    int getHammingDistance() {
        return hamming;
    }
}
