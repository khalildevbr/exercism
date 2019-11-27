import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return square(IntStream.range(1, ++input).sum());
    }

    int computeSumOfSquaresTo(int input) {
        return IntStream
                .range(1, ++input)
                .map(this::square)
                .sum();
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

    private int square(int value) {
        return value * value;
    }
}
