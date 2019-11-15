class HandshakeCalculator {
    companion object {
        fun calculateHandshake(value: Int): List<Signal> {
            val binaryReversed = Integer.toBinaryString(value).reversed()
            val signalList = binaryReversed.mapIndexedNotNull { index, char -> getSignal(char, index) }
            return if (value <= 15) signalList else signalList.reversed()
        }

        private fun getSignal(char: Char, index: Int): Signal? {
            return when (char) {
                '1' -> Signal.values().find { it.value == index }
                else -> null
            }
        }
    }

    enum class Signal(val value: Int) {
        WINK(0), DOUBLE_BLINK(1), CLOSE_YOUR_EYES(2), JUMP(3)
    }
}