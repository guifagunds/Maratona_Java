package MaratonaJava.Javacore.SFormatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeUS = Locale.US;
        Locale localeIT = Locale.ITALY;
        NumberFormat [] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance(localePT);
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeUS);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        double valor = 10_000.00;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "￥10,000";
        try{
            System.out.println(nfa[1].parse(valorString));
        }catch(ParseException e){
            e.printStackTrace();
        }


    }

}
