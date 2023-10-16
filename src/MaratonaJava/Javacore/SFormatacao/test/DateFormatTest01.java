package MaratonaJava.Javacore.SFormatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.LONG);
        df[5] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateformat : df) {
            System.out.println(dateformat.format(calendar.getTime()));
        }

    }
}

