package chapter52;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTimeTest {
    public static void main(String[] args) {
        //현재 시간
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //특정 일월년
        LocalDate past = LocalDate.of(2022, 12, 07);
        System.out.println(past);
        System.out.println(past.getDayOfWeek());

        //날짜 포맷
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateStr = past.format(dateTimeFormatter);
        System.out.println(dateStr);
    }
}
