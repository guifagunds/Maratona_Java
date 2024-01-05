package MaratonaJava.Javacore.URegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest02 {
    public static void main(String[] args) {

        //  \d = Todos os dígitos
        //  \D = Tudo o que não for dígito
        //  \s = Todos os espaços em branco  \t  \n  \f  \r
        //  \S = Todos os caracteres excluindo os brancos
        //  \w = a-Z, dígitos e _
        //  \W = Tudo o que não for incluso no \w

        String regex = "\\w";
        //String texto = "abaaba";
        String texto2 = "a2s3d1s5 _ad4 5j";
        Pattern pattern = Pattern.compile("\\w");
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: "+texto2);
        System.out.println("indice:0123456789 ");
        System.out.println("regex "+ regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
