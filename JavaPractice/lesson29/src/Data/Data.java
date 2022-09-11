package Data;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    void smena(LocalDateTime ld1, LocalDateTime ld2, Period p, Duration d) {
        while (ld1.isBefore(ld2)) {
            System.out.print("Rabotaem s: " + ld1.format(dtf));
            ld1 = ld1.plus(p);
            System.out.println(" Do: " + ld1.format(dtf));
            System.out.print("Otdihaem s: " + dtf2.format(ld1));
            ld1 = ld1.plus(d);
            System.out.println(" Do: " + dtf2.format(ld1));
        }
    }

    public static void main(String[] args) {
//        Data d = new Data();
//        LocalDateTime ldt1 = LocalDateTime.of(2021, 7, 12, 6, 30);
//        LocalDateTime ldt2 = LocalDateTime.of(2022, 9, 24, 22, 45);
//        Period p = Period.ofMonths(1);
//        Duration duration = Duration.ofMinutes(105);
//        d.smena(ldt1, ldt2, p, duration);

        LocalDate ldt = LocalDate.of(2012, 6, 15);
        String s = ldt.getDayOfWeek().name();
        System.out.println(s);
    }
}
