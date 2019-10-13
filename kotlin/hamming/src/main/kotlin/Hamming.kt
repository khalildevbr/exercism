class Hamming {
    companion object {
        fun compute(initial: String, compare: String): Int {
            return if (initial.length == compare.length) {
                var t = 0
                for (i in 0 until initial.length) {
                    if (initial[i].toUpperCase() != compare[i].toUpperCase()) {
                        t++
                    }
                }
                t
            } else {
                throw  IllegalArgumentException("left and right strands must be of equal length.")
            }
        }
    }
}