class Year(private val year: Int) {
    var isLeap: Boolean = leap()
    private fun leap(): Boolean = year % 4 == 0 && ((year % 100 == 0 && year % 400 == 0) || year % 100 != 0)
}