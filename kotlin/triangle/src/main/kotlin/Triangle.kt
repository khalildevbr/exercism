class Triangle<out T : Number>(val firstSide: T, val secondSide: T, val thirdSide: T) {

    init {
        val sides = listOf(firstSide.toDouble(), secondSide.toDouble(), thirdSide.toDouble())
        require(sides.all { side -> side > 0 } && sides.all { side -> sides.sum() - side >= side })
    }

    val isEquilateral: Boolean = setOf(firstSide, secondSide, thirdSide).size == 1
    val isIsosceles: Boolean = setOf(firstSide, secondSide, thirdSide).size <= 2
    val isScalene: Boolean = setOf(firstSide, secondSide, thirdSide).size == 3
}
