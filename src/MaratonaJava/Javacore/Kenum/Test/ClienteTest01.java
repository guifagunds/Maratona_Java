package MaratonaJava.Javacore.Kenum.Test;

import MaratonaJava.Javacore.Kenum.dominio.Cliente;
import MaratonaJava.Javacore.Kenum.dominio.Cliente.tipoDePagamento;
import MaratonaJava.Javacore.Kenum.dominio.TipoCliente;

import static MaratonaJava.Javacore.Kenum.dominio.Cliente.tipoDePagamento.CREDITO;
import static MaratonaJava.Javacore.Kenum.dominio.Cliente.tipoDePagamento.DEBITO;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Guilherme", TipoCliente.PESSOA_FISIC, DEBITO);
        Cliente cliente2 = new Cliente("Valéria", TipoCliente.PESSOA_JURIDICA, CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);



    }
}
