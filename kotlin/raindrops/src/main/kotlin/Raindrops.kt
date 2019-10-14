class Raindrops {
    companion object {
        fun convert(input: Int): String {
            val factors = ArrayList<Int>()
            var aux = input
            while (aux > 1) {
                if (input % aux == 0) {
                    factors.add(0, aux)
                }
                aux--
            }
            var result = ""
            factors.forEach { factor ->
                when (factor) {
                    3 -> result += "Pling"
                    5 -> result += "Plang"
                    7 -> result += "Plong"
                }
            }
            if (result.isEmpty()) result = "$input"
            return result
        }
    }
}