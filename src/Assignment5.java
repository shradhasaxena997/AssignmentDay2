import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Assignment5 {
    public static void main(String[] args) {
        for(int i=1950;i<=2020;i++) {

            LocalDate date = LocalDate.of(i, 9, 20);

            List<Integer> list = new ArrayList<>();
            list.add(date.getYear());
            list.stream()
                    .filter(s->(s%400==0||s%4==0)&&(s%100!=0))
                    .forEach(System.out::println);



        }

    }
}
