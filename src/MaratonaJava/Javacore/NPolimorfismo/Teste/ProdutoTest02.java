package MaratonaJava.Javacore.NPolimorfismo.Teste;

import MaratonaJava.Javacore.NPolimorfismo.dominio.Computador;
import MaratonaJava.Javacore.NPolimorfismo.dominio.Produto;
import MaratonaJava.Javacore.NPolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador( "Macbook air", 2000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("---------------------------");
        Produto produto2 = new Tomate( "Tomate tradicional", 2);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }



}
