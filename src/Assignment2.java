import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Assignment2 {
    public static void main(String[] args) {
        Period between = Period.between(LocalDate.of(1996 ,9, 20), LocalDate.of(2000, 9, 20));






        for(int i=1997;i<=2020;i++) {

            LocalDate date = LocalDate.of(i, 9, 20);

            List<DayOfWeek> list = new ArrayList<>();
            list.add(date.getDayOfWeek());
            System.out.println(list);


        }


    }
}
