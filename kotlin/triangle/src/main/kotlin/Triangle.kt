class Triangle<out T : Number>(val firstSide: T, val secondSide: T, val thirdSide: T) {

    init {
        val list = listOf(firstSide.toDouble(), secondSide.toDouble(), thirdSide.toDouble())
        require(list.all { it > 0 } && list.all { list.sum() - it >= it })
    }

    val isEquilateral: Boolean = setOf(firstSide, secondSide, thirdSide).size == 1
    val isIsosceles: Boolean = setOf(firstSide, secondSide, thirdSide).size <= 2
    val isScalene: Boolean =  setOf(firstSide, secondSide, thirdSide).size == 3
}
