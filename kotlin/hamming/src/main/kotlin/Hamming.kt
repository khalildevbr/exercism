class Hamming {
    companion object {
        fun compute(initial: String, compare: String): Int {
            require(initial.length == compare.length) { "left and right strands must be of equal length." }
            return initial.zip(compare).count { it.first != it.second }
        }
    }
}