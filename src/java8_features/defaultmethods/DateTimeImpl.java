package java8_features.defaultmethods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeImpl implements DateTimeInterface {

    private LocalDateTime time;

    public DateTimeImpl() {
        time = LocalDateTime.now();
    }

    @Override
    public void setTime(int hour, int minute, int second) {
        LocalDate currentDate = LocalDate.from(time);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        time = LocalDateTime.of(currentDate, timeToSet);
    }

    @Override
    public void setDate(int day, int month, int year) {
        LocalTime currentTime = LocalTime.from(time);
        LocalDate dateToSet = LocalDate.of(year, month, day);
        time = LocalDateTime.of(dateToSet, currentTime);
    }

    @Override
    public void setDateAndTime(int day, int month, int year, int hour, int minute, int second) {
        time = LocalDateTime.of(year, month, day, hour, minute, second);
    }

    @Override
    public LocalDateTime getLocalDateTime() {
        return time;
    }
}
