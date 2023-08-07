package MaratonaJava.Javacore.JModificadorFinal.test;

import MaratonaJava.Javacore.JModificadorFinal.Dominio.Carro;
import MaratonaJava.Javacore.JModificadorFinal.Dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Kuririm");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();



    }
}
