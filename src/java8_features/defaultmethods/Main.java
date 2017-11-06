package java8_features.defaultmethods;

public class Main {

    public static void main(String[] args) {
        DateTimeInterface dateTime = new DateTimeImpl();

        System.out.println(dateTime.getLocalDateTime());
        System.out.println(dateTime.getZonedDateTime("sdjhgsj"));
    }
}
