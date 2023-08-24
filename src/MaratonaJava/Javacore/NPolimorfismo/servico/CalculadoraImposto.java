package MaratonaJava.Javacore.NPolimorfismo.servico;

import MaratonaJava.Javacore.NPolimorfismo.dominio.Computador;
import MaratonaJava.Javacore.NPolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do computador"+computador.getNome());
        System.out.println("Valor"+computador.getValor());
        System.out.println("Imposto a se pagar"+imposto);
    }
    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do computador"+tomate.getNome());
        System.out.println("Valor"+tomate.getValor());
        System.out.println("Imposto a se pagar"+imposto);
    }
}
