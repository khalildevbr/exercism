class Pangram {

    companion object {
        fun isPangram(text: String): Boolean {
            return ('a'..'z').all { text.contains(it, true) }
        }
    }
}