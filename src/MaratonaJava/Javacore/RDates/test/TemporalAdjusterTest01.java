package MaratonaJava.Javacore.RDates.test;


import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterPropximoDiaUtil implements TemporalAdjuster{


    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayofWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = 1;
        switch (dayofWeek){
            case THURSDAY:addDays=4; break;
            case FRIDAY: addDays =3; break;
            case SATURDAY: addDays =2; break;
            default: addDays = 1;
        }

        return temporal.plus(addDays, ChronoUnit.DAYS);

    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new ObterPropximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(15).with(new ObterPropximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(19).with(new ObterPropximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(20).with(new ObterPropximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
