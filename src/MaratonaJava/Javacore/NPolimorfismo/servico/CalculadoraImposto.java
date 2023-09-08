package MaratonaJava.Javacore.NPolimorfismo.servico;

import MaratonaJava.Javacore.NPolimorfismo.dominio.Computador;
import MaratonaJava.Javacore.NPolimorfismo.dominio.Produto;
import MaratonaJava.Javacore.NPolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
        if(produto instanceof Tomate){
        Tomate tomate = (Tomate) produto;
        System.out.println(tomate.getDataDeValidade());}

    }
}
