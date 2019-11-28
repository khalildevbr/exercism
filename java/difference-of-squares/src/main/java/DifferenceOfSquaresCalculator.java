class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return square((input * (input + 1)) / 2);
    }

    int computeSumOfSquaresTo(int input) {
        if (input == 1) {
            return 1;
        } else {
            return input * input + computeSumOfSquaresTo(input - 1);
        }
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

    private int square(int value) {
        return value * value;
    }
}
