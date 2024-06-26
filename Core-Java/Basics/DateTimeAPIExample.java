import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeAPIExample {
    public static void main(String[] args) {
        // LocalDate example - represents a date without time (e.g., 2024-06-23)
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        // LocalTime example - represents a time without date (e.g., 14:30:00)
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // LocalDateTime example - represents date and time without timezone (e.g., 2024-06-23T14:30:00)
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // ZonedDateTime example - represents date and time with timezone (e.g., 2024-06-23T14:30:00+05:30[Asia/Kolkata])
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned Date and Time: " + zonedDateTime);

        // Instant example - represents a point in time (e.g., 2024-06-23T09:00:00Z)
        Instant instant = Instant.now();
        System.out.println("Instant (UTC timestamp): " + instant);

        // Formatting LocalDateTime - using a custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // Adding and subtracting days using LocalDate
        LocalDate tomorrow = today.plusDays(1);
        LocalDate oneWeekAgo = today.minus(1, ChronoUnit.WEEKS);
        System.out.println("Tomorrow: " + tomorrow);
        System.out.println("One Week Ago: " + oneWeekAgo);

        // Calculating duration between two instants (e.g., measuring time taken by a task)
        Instant start = Instant.now();
        // Simulate some operation
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Duration: " + duration.getSeconds() + " seconds");

        // Calculating period between two dates (e.g., finding the difference in months and days)
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period.getMonths() + " months and " + period.getDays() + " days");

        // Time zone conversion example
        ZonedDateTime nyDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime londonDateTime = nyDateTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("New York Date and Time: " + nyDateTime);
        System.out.println("London Date and Time: " + londonDateTime);
    }
}
