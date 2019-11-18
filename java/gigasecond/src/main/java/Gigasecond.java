import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    private LocalDateTime dateTime;

    Gigasecond(LocalDate moment) {
       this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
        long GIGASECOND = (long) Math.pow(10, 9);
        dateTime = moment.plusSeconds(GIGASECOND);
    }

    LocalDateTime getDateTime() {
        return dateTime;
    }
}
