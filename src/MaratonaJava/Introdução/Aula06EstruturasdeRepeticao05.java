package MaratonaJava.Introdução;

public class Aula06EstruturasdeRepeticao05 {
    // aqui vamos fazer o inverso da aula 04 mas decreentando a parcela e usando o cintinue ao invés do break
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Esta é a parcela numero: "+parcela+" no valor de: "+valorParcela);
        }
    }
}
