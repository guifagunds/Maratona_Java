package MaratonaJava.Javacore.QStrings.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nomeDeGato = "Dorinha";
        String numeros = "012345";
        System.out.println(nomeDeGato.charAt(0));
        System.out.println(nomeDeGato.length());
        System.out.println(nomeDeGato.replace("D", "T"));
        System.out.println(nomeDeGato.toLowerCase());
        System.out.println(nomeDeGato.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3,numeros.length()));
        System.out.println(nomeDeGato.trim());



    }
}
