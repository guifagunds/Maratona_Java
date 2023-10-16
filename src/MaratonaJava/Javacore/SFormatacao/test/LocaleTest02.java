package MaratonaJava.Javacore.SFormatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
       // System.out.println(Locale.getDefault());// mostra como está configurado na sua maquina país e lingua
        String [] isoCoutries =Locale.getISOCountries();
        String [] isoLanguages= Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage+" ");
        }
        System.out.println("");
        for (String isoCoutry : isoCoutries) {
            System.out.print(isoCoutry+" ");
        }
// nesse array ele mostra os países e suas respectivas línguas

    }
}
