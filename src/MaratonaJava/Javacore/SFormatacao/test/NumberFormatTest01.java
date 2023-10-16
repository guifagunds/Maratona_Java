package MaratonaJava.Javacore.SFormatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeUS = Locale.US;
        Locale localeIT = Locale.ITALY;
        NumberFormat [] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance(localePT);
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeUS);
        nfa[3] = NumberFormat.getInstance(localeIT);
        double valor = 10_000.00;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
            
        }


    }

}
