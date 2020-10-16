import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Assignment4 {

    public static void main(String[] args) {

        LocalDate from = LocalDate.of(2019, 11, 4);
        LocalDate to = LocalDate.of(2020, 11, 10);


        long days = ChronoUnit.DAYS.between(from, to);
        long sec=days*86400;


        System.out.println(sec + " sec");


    }

}