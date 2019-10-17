import kotlin.math.pow

class Squares(private val number: Int) {

    fun squareOfSum(): Int {
        return 0.rangeTo(number).sum().toDouble().pow(2.0).toInt()
    }
    
    fun sumOfSquares(): Int {
        return 0.rangeTo(number).sumBy { it.toDouble().pow(2.0).toInt() }
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }
}