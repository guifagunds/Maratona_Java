package MaratonaJava.Javacore.QStrings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Guilherme Fagundes";
        nome.concat("Desenvolvedor Junior");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Guilherme Fagundes");
        StringBuilder sb2 = new StringBuilder(16); //realocar espaço em memoria
        sb.append(" Guifagunds").append(" Desenvolvedor Java");
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
    }
}
