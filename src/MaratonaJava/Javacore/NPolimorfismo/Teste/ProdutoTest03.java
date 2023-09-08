package MaratonaJava.Javacore.NPolimorfismo.Teste;

import MaratonaJava.Javacore.NPolimorfismo.dominio.Computador;
import MaratonaJava.Javacore.NPolimorfismo.dominio.Produto;
import MaratonaJava.Javacore.NPolimorfismo.dominio.Tomate;
import MaratonaJava.Javacore.NPolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador( "Macbook air", 2000);


        Tomate tomate= new Tomate( "Tomate tradicional", 2);
        tomate.setDataDeValidade("11/11/2023");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(produto);


    }



}
