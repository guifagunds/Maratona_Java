package MaratonaJava.Javacore.NPolimorfismo.Teste;

import MaratonaJava.Javacore.NPolimorfismo.dominio.Computador;
import MaratonaJava.Javacore.NPolimorfismo.dominio.Televisao;
import MaratonaJava.Javacore.NPolimorfismo.dominio.Tomate;
import MaratonaJava.Javacore.NPolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Mac", 18000);
        Tomate tomate = new Tomate("cereja", 12);
        Televisao tv = new Televisao("samsung 5455t", 3500);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(tv);

    }
}
