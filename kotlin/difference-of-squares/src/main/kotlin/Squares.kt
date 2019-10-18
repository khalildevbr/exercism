class Squares(private val number: Int) {

    fun squareOfSum(): Int {
        return 0.rangeTo(number).sum().pow()
    }

    fun sumOfSquares(): Int {
        return 0.rangeTo(number).sumBy { it.pow() }
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }

    private fun Int.pow(): Int = this * this
}