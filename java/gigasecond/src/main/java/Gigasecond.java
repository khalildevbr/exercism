import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    private LocalDateTime dateTime;

    Gigasecond(LocalDate moment) {
       this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
        long PLUS_SECONDS = (long) Math.pow(10, 9);
        dateTime = moment.plusSeconds(PLUS_SECONDS);
    }

    LocalDateTime getDateTime() {
        return dateTime;
    }
}
