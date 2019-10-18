class Squares(private val number: Int) {

    fun squareOfSum(): Int {
        return 0.rangeTo(number).sum().square()
    }

    fun sumOfSquares(): Int {
        return 0.rangeTo(number).sumBy { it.square() }
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }

    private fun Int.square(): Int = this * this
}