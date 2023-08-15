package MaratonaJava.Javacore.KEnum.Test;

import MaratonaJava.Javacore.KEnum.dominio.Cliente;
import MaratonaJava.Javacore.KEnum.dominio.Cliente.tipoDePagamento;
import MaratonaJava.Javacore.KEnum.dominio.TipoCliente;
import MaratonaJava.Javacore.KEnum.dominio.TipodePagamento;


public class ClienteTest01 {
    private static Object tipoDePagamento;

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Guilherme", TipoCliente.PESSOA_FISIC, Cliente.tipoDePagamento.DEBITO);
        Cliente cliente2 = new Cliente("Valéria", TipoCliente.PESSOA_JURIDICA, Cliente.tipoDePagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipodePagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipodePagamento.CREDITO.calcularDesconto(100));


    }
}
