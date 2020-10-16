import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Assignmemt3 {
    public static void main(String[] args) {
        DateTimeFormatter formatTodayWithZoneId = DateTimeFormatter.ofPattern("MM/dd/yy hh:mm:ss VV");

        LocalDateTime today = LocalDateTime.now();
        ZoneId timeZone = ZoneId.of("America/New_York");
        ZonedDateTime todayWithTimeZone = ZonedDateTime.of(today, timeZone);
        System.out.format("Formatted date time with zone ID of New York is %s\n", todayWithTimeZone.format(formatTodayWithZoneId));
    }
}
