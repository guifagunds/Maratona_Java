package MaratonaJava.Introdução;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long e double = 0
        // char '\u0000'            esses exemplos é quando vc não inicializa as variáveis e resulta nessas saidas
        // boolean false
        // String null
        String [] nomes = new String[4];
        nomes[0]="Ross";
        nomes[1]="Rachel";
        nomes[2]="Chandler";
        nomes[3]="Phoebe";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
