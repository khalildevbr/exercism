
import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond (private val startDateTime: LocalDateTime) {
    constructor(startDate: LocalDate) :  this(startDate.atStartOfDay())
    val date: LocalDateTime = startDateTime.plusSeconds(1e9.toLong())
}