package MaratonaJava.Javacore.FModificadoresEstaticos.test;

import MaratonaJava.Javacore.FModificadoresEstaticos.domain.Carro;

public class carrotest01 {
    public static void main(String[] args) {
        Carro.VelocidadeLimite = 180;

        Carro c1 = new Carro("Bmw", 280);
        Carro c2 = new Carro("Porshe", 290);
        Carro c3 = new Carro("Mercedez", 250);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
