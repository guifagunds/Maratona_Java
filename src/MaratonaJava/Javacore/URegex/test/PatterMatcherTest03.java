package MaratonaJava.Javacore.URegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest03 {
    public static void main(String[] args) {
        
        // [] = encontra as palavras que estão dentro do colchetes
        // String regex = "[a-zA-C]";
        String regex = "[0[xX][0-9a-fA-F]";
        String texto = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile("[abcABC]");
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: "+texto);
        System.out.println("indice:0123456789 ");
        System.out.println("regex "+ regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

        int numeroHexadecimal = 0XFFFFFF;
        System.out.println(numeroHexadecimal);
    }
}
