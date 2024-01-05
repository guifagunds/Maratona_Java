package MaratonaJava.Javacore.URegex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest05 {
    public static void main(String[] args) {

        String regex = "([a-zA-Z0-9\\._-])+@([a-z])+(\\.([a-z])+)+";
        String texto = "guilhermehpoliveira@hotmail.com, cosentinonando@gmail.com, @#gui@gmail.com, valeriafagundes@gmail.com, dorinha@gmail.com";
        System.out.println("Email valido:");
        System.out.println("gui@gmail.com".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("indice:0123456789 ");
        System.out.println("regex " + regex);
        System.out.println("Emails encontrados");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
