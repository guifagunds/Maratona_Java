package MaratonaJava.Javacore.URegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest04 {
    public static void main(String[] args) {
        // ? Zero ou uma ocorrências
        // * Zero ou mais ocorrências
        // + Uma ou mais ocorrências
        // {n,m} de n até m
        // () agrupamento
        // | ou,  exemplo: o(v|c)o  ovo ou oco
        // $ fim da linha
        // .  1.3 = 123, 133, 1@3

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
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
