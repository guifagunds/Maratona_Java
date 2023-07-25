package MaratonaJava.Introdução;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salario = 4005000;
        double primeiraFaixa = 9.5 / 100;
        double segundaFaixa = 37.5 / 100 ;
        double terceiraFaixa = 50.5 / 100 ;
        double valorTaxa;

        if (salario <= 34000) {
            valorTaxa = salario * primeiraFaixa;
        } else if (salario >= 34713 && salario <= 68517) {
            valorTaxa = salario * segundaFaixa;
        } else {
            valorTaxa = salario * terceiraFaixa;
        }
        System.out.println(valorTaxa);
    }
}
