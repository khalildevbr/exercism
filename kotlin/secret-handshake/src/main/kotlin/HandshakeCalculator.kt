class HandshakeCalculator {
    companion object {
        fun calculateHandshake(value: Int): List<Signal> {
            val binaryReversed = Integer.toBinaryString(value).reversed()
            val signalList = binaryReversed.mapIndexedNotNull { index, char -> getSignal(char, index) }
            return if (value <= 15) signalList else signalList.reversed()
        }

        private fun getSignal(char: Char, index: Int): Signal? {
            return when (index) {
                0 -> if (char == '1') Signal.WINK else null
                1 -> if (char == '1') Signal.DOUBLE_BLINK else null
                2 -> if (char == '1') Signal.CLOSE_YOUR_EYES else null
                3 -> if (char == '1') Signal.JUMP else null
                else -> null
            }
        }
    }
}