class Triangle<out T : Number>(val firstSide: T, val secondSide: T, val thirdSide: T) {
    private val sides: List<Double> = listOf(firstSide.toDouble(), secondSide.toDouble(), thirdSide.toDouble())
    private val sidesSet = sides.toSet()

    init {
        val sum = sides.sum()
        require(sides.all { side -> side > 0 } && sides.all { side -> sum - side >= side })
    }

    val isEquilateral: Boolean = sidesSet.size == 1
    val isIsosceles: Boolean = sidesSet.size <= 2
    val isScalene: Boolean = sidesSet.size == 3
}
